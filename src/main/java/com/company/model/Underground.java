package com.company.model;

import java.util.Set;

public abstract class Underground extends AbstractLocation{

    public Underground(String name, String address, int size, Set<Person> persons) {
        super(name, address, size, persons);
    }

    @Override
    public int getMaxPersons() {
        return getSize()/10;
    }
}
