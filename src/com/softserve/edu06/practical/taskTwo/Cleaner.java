package com.softserve.edu06.practical.taskTwo;

public class Cleaner extends Staff {
    private final TypePerson TYPE_PERSON = TypePerson.CLEANER;

    public Cleaner() {
        System.out.println("Type person = " + TYPE_PERSON.name());
    }

    public Cleaner(String name) {
        super(name);
        System.out.println("Type person = " + TYPE_PERSON.name());
    }

    @Override
    public String print() {
        return "I am a cleaner";
    }

    @Override
    public double salary() {
        return 10_000;
    }
}
