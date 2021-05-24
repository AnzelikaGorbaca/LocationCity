package com.company.model;

import java.util.List;

public abstract class AbstractLocation implements Location {
    private String name;
    private String address;
    private int size;
    List<Person> persons;

    public AbstractLocation(String name, String address, int size, List<Person> persons) {
        this.name = name;
        this.address = address;
        this.size = size;
        this.persons = persons;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public List<Person> getPersons() {
        return persons;
    }

    @Override
    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
