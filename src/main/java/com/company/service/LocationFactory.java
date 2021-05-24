package com.company.service;

import com.company.model.Park;
import com.company.model.Person;

import java.util.ArrayList;
import java.util.List;

public class LocationFactory {

    public Park createPark (String name, String address, int size) {
       return new Park (name, address,size, new ArrayList <Person> ());


    }
}
