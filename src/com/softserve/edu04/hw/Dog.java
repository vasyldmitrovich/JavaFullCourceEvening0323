package com.softserve.edu04.hw;

public class Dog {
    enum Breed {
        LABRADOR, POODLE, BULLDOG
    }

    private String Name;
    private Breed breed;
    private int Age;

    public Dog(String name, Breed breedd, int age) {
        Name = name;
        breed = breedd;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return Age;
    }
}
