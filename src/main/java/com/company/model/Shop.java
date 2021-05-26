package com.company.model;

import java.util.Set;

public class Shop extends Building{
    public Shop(String name, String address, int size, Set<Person> persons) {
        super(name, address, size, persons);
    }
}
