package com.softserve.edu06.practical.taskTwo;

public abstract class Person {
    private String name;
    private final TypePerson TYPE_PERSON = TypePerson.PERSON;

    public String getName() {
        return name;
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String print();
}
