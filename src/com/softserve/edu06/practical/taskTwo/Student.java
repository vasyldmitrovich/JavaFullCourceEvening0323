package com.softserve.edu06.practical.taskTwo;

public class Student extends Person {
    private final TypePerson TYPE_PERSON = TypePerson.STUDENT;

    public Student() {
    }

    public Student(String name) {
        super(name);
        System.out.println("Type person = " + TYPE_PERSON.name());
    }

    @Override
    public String print() {
        return "I am a student";
    }
}
