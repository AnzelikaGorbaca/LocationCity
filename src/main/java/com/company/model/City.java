package com.company.model;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class City {
    private String name;
    private List<Location> location;
    private Set<Person> persons;

    public City(String name, List<Location> location, Set<Person> persons) {
        this.name = name;
        this.location = location;
        this.persons = persons;
    }

    public void isolatePersons() {
        Random random = new Random();
        for (Person person : persons) {
            boolean isolation = random.nextBoolean();
            person.setSelfIsolation(isolation);

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Location> getLocation() {
        return location;
    }

    public void setLocation(List<Location> location) {
        this.location = location;
    }

    public Set<Person> getPersons() {
        return persons;
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }
}
