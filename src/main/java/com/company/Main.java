package com.company;

import com.company.model.City;
import com.company.model.Location;
import com.company.model.Person;
import com.company.service.LocationFactory;
import com.company.service.PersonProcessor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<Location> locations = new ArrayList<>();
        LocationFactory locationFactory = new LocationFactory();
        Location cafe = locationFactory.createCafe("Bella Bella", "Briezu iela 5", 1000);
        Location shop = locationFactory.createShop("Alfa", "Brivibas iela 5", 10000);
        Location park = locationFactory.createPark("Viestura", "Brivibas iela 9", 10000);
        Location stadium = locationFactory.createStadium("Skonto", "Brivibas iela 11", 100000);
        Location metro = locationFactory.createMetro("Metro", "Brivibas iela 1", 100000000);

        locations.add(cafe);
        locations.add(shop);
        locations.add(park);
        locations.add(stadium);
        locations.add(metro);

        Set<Person> persons = new HashSet<>();
        Person person1 = new Person("Aaaa", "121212-10658", "aaeae iela", 22);
        Person person2 = new Person("Bbbb", "121112-10688", "aaeae iela", 27);
        Person person3 = new Person("Cccc", "121152-10658", "gggg iela", 12);
        Person person4 = new Person("Dddd", "188812-10658", "addde iela", 50);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);


        City city = new City("Riga", locations, persons);

        PersonProcessor personProcessor = new PersonProcessor(city);


    }
}
