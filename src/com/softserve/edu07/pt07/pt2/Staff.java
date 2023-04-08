package com.softserve.edu07.pt07.pt2;

public abstract class Staff extends Person {

    public Staff(String name) {
        super(name);
    }

    public Staff() {
    }

    @Override
    public abstract void print(
    );

    public abstract void salary();
}
