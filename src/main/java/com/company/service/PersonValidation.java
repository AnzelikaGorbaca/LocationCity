package com.company.service;

import com.company.model.Location;
import com.company.model.Person;

public class PersonValidation {

    public boolean validate(Person person, Location location) {
        return (!person.isSelfIsolation() && location.getMaxPersons() > location.getPersons().size())
                && (person.getAge() <= 12
                || location.getPersons().stream().anyMatch(t -> {
            return t.getAddress().equals(person.getAddress());
        }));
    }
}
