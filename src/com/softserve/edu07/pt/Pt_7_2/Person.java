package com.softserve.edu07.pt.Pt_7_2;

abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    //Do not write worlds public abstract, it is there by default
    public abstract void print();

}
