package com.softserve.edu07.pt07.task2;

public class Teacher extends Staff{
    final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    public void print() {
        System.out.println("I am a Teacher");
    }

    public void salary() {
        System.out.println("Salary: $50,000");
    }
}
