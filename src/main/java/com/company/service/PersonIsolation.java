package com.company.service;

import com.company.model.City;
import com.company.model.Location;
import com.company.model.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonIsolation {
    private final List<Person> isolated = new ArrayList<>();


    public void isolatePersons(City city) {
        PersonProcessor personProcessor = new PersonProcessor();
        city.setRandomSelfIsolation();

        List<Person> positiveTest = city.getPersons().stream().filter(Person::isSelfIsolation).collect(Collectors.toList());
        List<Person> personsInCity = city.getPersons();

        System.out.println("Person in the city:" + personsInCity);
        System.out.println("Positive test" + positiveTest);


        for (Location location : city.getLocation()) {
            System.out.println("this is location.get persons: " + location.getPersons() + "\n");
            for (Person person : positiveTest) {
                if (location.getPersons().contains(person)) { // here
                    personProcessor.remove(location, person);
                    isolated.add(person);


                }
            }
        }

        city.setIsolated(isolated);

        /*for (Location location : city.getLocation()) {
            System.out.println("this is location.get persons: " + location.getPersons() + "\n");
            for (Person person : positiveTest) {
                List<Person> personsInLocation = new ArrayList<>(location.getPersons());
                for (Person person1 : personsInLocation) {
                    if (person1.equals(person)) {
                        personProcessor.remove(location, person);
                        isolated.add(person);
                    }
                }

            }
        }*/

       /* Map<Location, List<Person>> personsInLocation = new HashMap<>();
        for (Location location : city.getLocation()) {
            personsInLocation.put(location, location.getPersons());
        }


        for (Map.Entry<Location, List<Person>> entry : personsInLocation.entrySet()) {
            for (Person person : positiveTest) {
                if (entry.getValue().contains(person)) {
                    isolated.add(person);
                    personProcessor.remove(entry.getKey(), person);
                }
            }
        }

            */


    }


}
