package com.company.service;

import com.company.exception.PersonCannotBeAddedException;
import com.company.model.City;
import com.company.model.Location;
import com.company.model.Person;

import java.util.Set;

public class PersonProcessor {
    private City city;

    public PersonProcessor(City city) {
        this.city = city;
    }

    private PersonValidation personValidation = new PersonValidation();

    public void remove(Location location, Person person) {
        Set<Person> persons = location.getPersons();
        persons.remove(person);
    }

    public void add(Location location, Person person) {

        if (personValidation.validate(person, location)) {
            location.getPersons().add(person);
            city.getPersons().add(person);
        }
        else {
            throw new PersonCannotBeAddedException( "Person can not be added due to validation!");
        }


    }

}
