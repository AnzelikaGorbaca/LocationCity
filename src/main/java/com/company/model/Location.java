package com.company.model;

import java.util.List;

public interface Location {

    int getMaxPersons ();

    String getName();

    void setName(String name);

    String getAddress();

    void setAddress(String address);

    int getSize();

    void setSize(int size);

    List<Person> getPersons();

    void setPersons(List<Person> persons);

    int getPersonCounter();

    void countPerson();

    void subtractPerson ();

}
