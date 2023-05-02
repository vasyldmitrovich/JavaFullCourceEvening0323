package com.softserve.edu07.pt07.task2;

public abstract class Person {
    //Make field private and add getters and setters
    private String name;
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void print(){

    }
}
