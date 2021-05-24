package com.company.model;

import java.util.List;

public class Park extends  OpenAir{

    public Park(String name, String address, int size, List<Person> persons) {
        super(name, address, size, persons);
    }
}
