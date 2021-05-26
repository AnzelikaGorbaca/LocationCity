package com.company.view;

import com.company.controller.Controller;
import com.company.model.City;
import com.company.model.Location;
import com.company.model.Person;
import com.company.service.LocationFactory;
import com.company.service.PersonProcessor;


import java.util.ArrayList;
import java.util.List;



public class Main {


    public static void main(String[] args) {
        PersonProcessor personProcessor = new PersonProcessor();
        LocationFactory locationFactory = new LocationFactory();

        Location cafe = locationFactory.createCafe("Bella Bella", "Viestura iela 19", 5);
        Location shop = locationFactory.createShop("Alfa", "Brivibas iela 254", 1000);
        Location park = locationFactory.createPark("Meza parks", "Meza parks", 11820000);
        Location stadium = locationFactory.createStadium("Skonto", "Skonto iela 12", 50000);
        Location metro = locationFactory.createMetro("Metro", "No adress", 900000000);

        List<Location> locations = new ArrayList<>();
        locations.add(cafe);
        locations.add(shop);
        locations.add(park);
        locations.add(stadium);
        locations.add(metro);


        //PERSONS

        Person person1 = new Person("Anzelika", "121244-12205", "Briezu iela 7", 22);
        Person person2 = new Person("Santa", "121254-12215", "Zvaignu iela 7", 23);
        Person person3 = new Person("Agnese", "100044-12200", "Briezu iela 7", 22);
        Person person4 = new Person("Santa", "121004-12005", "Aaaa iela 7", 12);


        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        //ADD PERSONS TO LOCATIONS
        personProcessor.add(cafe, person1);
        personProcessor.add(cafe, person2);
        personProcessor.add(cafe, person3);
        personProcessor.add(cafe, person4);
        //personProcessor.add (cafe,person1);


        //CITY
        City city = new City("Riga", locations, persons);
        Controller controller = new Controller(cafe, shop, park, stadium, metro, city);

        //FOR USER
        Location location = controller.chooseLocation();
        controller.action(location);

    }

}
