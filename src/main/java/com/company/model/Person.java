package com.company.model;

import java.util.Objects;

public class Person {
    private String name;
    private String personalCode;
    private String address;
    private int age;
    private boolean selfIsolation;

    public Person(String name, String personalCode, String address, int age) {
        this.name = name;
        this.personalCode = personalCode;
        this.address = address;
        this.age = age;
        this.selfIsolation = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSelfIsolation() {
        return selfIsolation;
    }

    public void setSelfIsolation(boolean selfIsolation) {
        this.selfIsolation = selfIsolation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && selfIsolation == person.selfIsolation && getName().equals(person.getName()) && getPersonalCode().equals(person.getPersonalCode()) && getAddress().equals(person.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPersonalCode(), getAddress(), getAge(), selfIsolation);
    }

    @Override
    public String toString() {
        return  String.format("\n %-20s %-20s %-20s %-20d",  name, address,personalCode,age);
    }
}
