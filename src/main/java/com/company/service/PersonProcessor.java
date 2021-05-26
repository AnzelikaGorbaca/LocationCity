package com.company.service;

import com.company.exceptions.LimitException;
import com.company.exceptions.NoSuchPersonException;
import com.company.exceptions.PersonAreadyExistsException;
import com.company.model.City;
import com.company.model.Location;
import com.company.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonProcessor {

    PersonValidation personValidation = new PersonValidation();

    public void remove(Location location, Person person) {

        List<Person> persons = location.getPersons();
        if (person != null) {
            if (!persons.contains(person)) {
                //throw new NoSuchPersonException("There is no such person in this location!");

            } else if (personValidation.validate(person, location)) {
                location.subtractPerson();
            }

            persons.remove(person);

        }

    }

    public void add(Location location, Person person) {

        if (location.getPersonCounter() < location.getMaxPersons() || !personValidation.validate(person, location)) {

            List<Person> persons = location.getPersons();
            if (person != null) {
                if (personValidation.validate(person, location)) {
                    location.countPerson();
                }

                if (!persons.contains(person)) {
                    persons.add(person);


                } else {
                    throw new PersonAreadyExistsException("This person already exists at this location!");
                }
            }

        } else {
            throw new LimitException("Person can't be added, maximum  person limit (" + location.getMaxPersons() + " persons) has been reached at this location!");
        }


    }

    public void updatePersonsInCity(City city, Person person) {
        if (!city.getPersons().contains(person)) {
            city.getPersons().add(person);
        }
    }


}
