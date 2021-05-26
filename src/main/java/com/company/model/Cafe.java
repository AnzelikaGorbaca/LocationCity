package com.company.model;

import java.util.Set;

public class Cafe extends Building{
    public Cafe(String name, String address, int size, Set<Person> persons) {
        super(name, address, size, persons);
    }
}
