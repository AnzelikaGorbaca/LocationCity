package com.company.model;

import java.util.Set;

public class Park extends  OpenAir{

    public Park(String name, String address, int size, Set<Person> persons) {
        super(name, address, size, persons);
    }
}
