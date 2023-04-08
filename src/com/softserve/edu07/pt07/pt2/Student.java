package com.softserve.edu07.pt07.pt2;

public class Student extends Person {

    private final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    public Student() {
        System.out.println(TYPE_PERSON+" created");
    }

    @Override
    public void print() {
        System.out.println("I'm a student person");
    }
}
