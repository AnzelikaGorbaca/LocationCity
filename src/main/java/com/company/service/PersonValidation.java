package com.company.service;

import com.company.model.Location;
import com.company.model.Person;

import java.util.List;

public class PersonValidation {

    public boolean validate(Person person, Location location) {
        if (person.getAge() <= 12) {
            return false;
        }

        List<Person> persons = location.getPersons();
        for (Person p : persons) {
            if (p.getAddress().equals(person.getAddress())) {
                return false;
            }
        }

        return true;
    }

}
