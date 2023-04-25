package com.softserve.edu07.pt;

public class Student extends Person{
    private final String TYPE_PERSON = "student";

    public Student() {
        System.out.println("This is " + TYPE_PERSON);
    }

    public Student(String name) {
        super(name);
        System.out.println("This is " + TYPE_PERSON);
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public String print() {
        return "I am a " + TYPE_PERSON;
    }
}
