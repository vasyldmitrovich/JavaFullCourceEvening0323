package com.softserve.edu07.pt.Task2;

public abstract class Staff extends Person{

    public Staff() {
    }

    public Staff(String name) {
        super(name);
    }

    public abstract void salary();
}
