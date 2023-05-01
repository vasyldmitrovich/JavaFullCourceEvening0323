package com.softserve.edu07.pt.Pt_7_2;

abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void print();

}
