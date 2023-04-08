package com.softserve.edu07.pt.Task2;

public abstract class Person {
    private String name;

    protected Person(){
    }

    protected Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void print();
}
