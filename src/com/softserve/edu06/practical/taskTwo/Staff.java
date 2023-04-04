package com.softserve.edu06.practical.taskTwo;

public abstract class Staff extends Person {
    private final TypePerson TYPE_PERSON = TypePerson.STAFF;

    public Staff() {
    }

    public Staff(String name) {
        super(name);
    }

    public abstract double salary();
}
