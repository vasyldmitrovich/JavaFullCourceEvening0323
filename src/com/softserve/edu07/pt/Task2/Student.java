package com.softserve.edu07.pt.Task2;

public class Student extends Person{
    private final String TYPE_PERSON = "Student";

    public Student() {
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    public Student(String name) {
        super(name);
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.println("Im a student");
    }
}
