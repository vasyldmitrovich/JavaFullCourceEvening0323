package com.softserve.edu07.pt07.task2;

public abstract class Person {
    //Make field private and add getters and setters
    String name;
    public Person(String name) {
        this.name = name;
    }

    //Del words public abstract, it will be public abstract by default
    public abstract void print();
}
