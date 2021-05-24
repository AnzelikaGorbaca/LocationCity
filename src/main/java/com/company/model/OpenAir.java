package com.company.model;

import java.util.List;

public abstract class OpenAir extends AbstractLocation {

    public OpenAir(String name, String address, int size, List<Person> persons) {
        super(name, address, size, persons);
    }

    @Override
    public int getMaxPersons() {
        return getSize();
    }
}
