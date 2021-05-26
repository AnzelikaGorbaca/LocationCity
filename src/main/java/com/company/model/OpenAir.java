package com.company.model;

import java.util.Set;

public abstract class OpenAir extends AbstractLocation {

    public OpenAir(String name, String address, int size, Set<Person> persons) {
        super(name, address, size, persons);
    }

    @Override
    public int getMaxPersons() {
        return getSize();
    }
}
