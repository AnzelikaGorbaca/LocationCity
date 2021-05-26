package com.company.model;

import java.util.Set;

public class Stadium extends  OpenAir{

    public Stadium(String name, String address, int size, Set<Person> persons) {
        super(name, address, size, persons);
    }
}
