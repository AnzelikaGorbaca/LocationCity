package com.company.model;

import java.util.Set;

public class Metro extends Underground {
    public Metro(String name, String address, int size, Set<Person> persons) {
        super(name, address, size, persons);
    }
}
