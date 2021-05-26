package com.company.model;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class City {
    private String name;
    private List<Location> location;
    private List<Person> persons;
    private final Set<Person> isolated;


    public City(String name, List<Location> location, List<Person> persons) {
        this.name = name;
        this.location = location;
        this.persons = persons;
        this.isolated=new HashSet<>();
    }

    public void setRandomSelfIsolation() {
        Random random = new Random();
        for (Person person : getPersons()) {
            boolean isolation = random.nextBoolean();
            person.setSelfIsolation(isolation);
        }
    }

    public Set<Person> getIsolated() {
        return isolated;
    }

    public void setIsolated(List<Person> isolated1) {
        isolated.addAll(isolated1);
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

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
