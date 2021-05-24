package com.company.service;

import com.company.model.Location;
import com.company.model.Person;

import java.util.List;

public class PersonProcessor {

    public void remove(Location location, Person person) {
        List<Person> persons = location.getPersons();
        persons.remove(person);
    }

    public void add (Location location, Person person) {

        List<Person> persons = location.getPersons();

    }
    //Create class for validation

}
