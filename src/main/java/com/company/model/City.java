package com.company.model;

import java.util.List;

public class City {
    private String name;
    private List<Location> location;
    private List<Person> persons;

    public City(String name, List<Location> location, List<Person> persons) {
        this.name = name;
        this.location = location;
        this.persons = persons;
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
