package com.softserve.edu03.hw;

import java.time.Year;
import java.time.ZoneId;

class Person {
    private String firstName, lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void changeName(String fn, String ln) {
        if (fn != "") {
            firstName = fn;
        }
        if (ln != "") {
            lastName = ln;
        }
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void input(String... properties) {
        this.firstName = properties[0];
        this.lastName = properties[1];
        this.birthYear = Integer.parseInt(properties[2]);
    }

    @Override
    public String toString() {
        return "Person [first name: " + firstName + ", last name: " + lastName +
                ", birth year: " + birthYear + ", age: " + getAge() + "]";
    }

    public int getAge() {
        return Year.now(ZoneId.of("Europe/Kiev")).getValue() - birthYear;
    }
}
