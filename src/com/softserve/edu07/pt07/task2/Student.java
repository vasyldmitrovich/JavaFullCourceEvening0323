package com.softserve.edu07.pt07.task2;

public class Student extends Person{
    final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    public void print() {
        System.out.println("I am a Student");
    }
}
