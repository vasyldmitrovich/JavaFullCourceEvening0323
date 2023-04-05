package com.softserve.edu07.pt07.task2;

public class Cleaner extends Staff{
    final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    public void print() {
        System.out.println("I am a Cleaner");
    }

    public void salary() {
        System.out.println("Salary: $30,000");
    }
}
