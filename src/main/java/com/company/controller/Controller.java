package com.company.controller;

import com.company.model.City;
import com.company.model.Location;
import com.company.model.Person;
import com.company.service.LocationFactory;
import com.company.service.PersonIsolation;
import com.company.service.PersonProcessor;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Controller {

    private final LocationFactory locationFactory = new LocationFactory();
    private final Location cafe;
    private final Location shop;
    private final Location park;
    private final Location stadium;
    private final Location metro;
    private final City city;


    public Controller(Location cafe, Location shop, Location park, Location stadium, Location metro, City city) {
        this.cafe = cafe;
        this.shop = shop;
        this.park = park;
        this.stadium = stadium;
        this.metro = metro;
        this.city = city;
    }


    private final PersonProcessor personProcessor = new PersonProcessor();
    private final Scanner scanner = new Scanner(System.in);


    public Location chooseLocation() {

        System.out.println("""

                Welcome to Riga city !\s
                You can choose the location and add there a person.
                Every location has persons capacity.

                Choose location:
                1 - CAFE Bella Bella
                2 - SHOP Alfa
                3 - PARK Viestura
                4 - STADIUM Skonto
                5 - METRO Metro
                """);

        int locationNumber = scanner.nextInt();
        return switch (locationNumber) {
            case 1 -> cafe;
            case 2 -> shop;
            case 3 -> park;
            case 4 -> stadium;
            default -> metro;
        };
    }

    public void action(Location location) {
        System.out.println("""

                Press 1 to see information about location capacity and persons inside
                Press 2 to ADD a person to the location
                Press 3 to DELETE a person from the location
                Press 4 to SWITCH location
                Press 5 to make a corona virus test in the city
                Press 6 to EXIT
                """);

        int action = 0;
        do {
            action = scanner.nextInt();
            switch (action) {
                case 1 -> information(location);
                case 2 -> addPerson(location);
                case 3 -> removePerson(location);
                case 4 -> {
                    location = chooseLocation();
                    action(location);
                }
                case 5 -> isolatePersons();
            }
        } while (action != 6);

        System.out.println("Goodbye!");

    }

    public void isolatePersons() {
        PersonIsolation personIsolation = new PersonIsolation();
        personIsolation.isolatePersons(city);

        String personsOnIsolation = city.getIsolated().toString();
        if (city.getIsolated().size() == 0) {
            System.out.println("Nobody is sick at your location");

        } else {
            System.out.println("Oops! Some persons are sick with Corona virus. We have found those who was in the locations and sent them home.");
            System.out.printf("\nIsolated persons:\n\n %1$-20s %2$-20s %3$-20s %4$-20s\n", "NAME", "ADDRESS", "PERSONAL CODE", "AGE");
            System.out.println(personsOnIsolation.replaceAll("[\\]\\[,]", ""));
        }

    }

    public void information(Location location) {
        System.out.println("Persons at the location: " + location.getPersons().size() + " \nAllowed: " + location.getMaxPersons());

        if (location.getPersons().size() > location.getPersonCounter()) {
            int kidsOrTheSameAddress = location.getPersons().size() - location.getPersonCounter();
            System.out.println("Persons with the same address or kid ( < 12 y.o.): " + kidsOrTheSameAddress);
        }

        System.out.printf("\n Persons at the location:\n\n %1$-20s %2$-20s %3$-20s %4$-20s \n", "NAME", "ADDRESS", "PERSONAL CODE", "AGE");
        System.out.println(location.getPersons().toString().replaceAll("[\\]\\[,]", ""));


    }

    public void addPerson(Location location) {

        System.out.println("Name: ");
        String name = scanner.next();
        System.out.println("Personal code: ");
        String code = scanner.next();
        System.out.println("Address: ");
        String address = scanner.next();
        System.out.println("Age: ");
        int age = scanner.nextInt();

        Person person = new Person(name, code, address, age);
        personProcessor.updatePersonsInCity(city, person);

        personProcessor.add(location, new Person(name, code, address, age));

        System.out.println(name + " is added to " + location.getName() + "\n");
        if (location.getMaxPersons() <= location.getPersons().size()) {
            System.out.println("WARNING! This location is overcrowded! You are allowed to add only kid ( < 12 y.o ) or person with the same address!");
        }
    }

    public void removePerson(Location location) {
        System.out.println("You need to provide only personal code to delete a person: ");
        String personalCode = scanner.next();

        Person personToRemove = null;
        for (Person person : location.getPersons()) {
            if (person.getPersonalCode().equals(personalCode)) {
                personToRemove = person;
            }
        }
        personProcessor.remove(location, new Person(personToRemove.getName(), personToRemove.getPersonalCode(),
                personToRemove.getAddress(), personToRemove.getAge()));
        System.out.println(personToRemove.getName() + " is removed from " + location.getName() + "\n");


    }

}


