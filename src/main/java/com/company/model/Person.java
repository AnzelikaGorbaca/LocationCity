package com.company.model;

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
}
