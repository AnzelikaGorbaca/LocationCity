package com.company.model;

import java.util.Set;

public interface Location {
    int getMaxPersons ();
    String getName();

    void setName(String name);

    String getAddress();

    void setAddress(String address);

    int getSize();

    void setSize(int size);

    Set<Person> getPersons();

    void setPersons(Set<Person> persons);

}
