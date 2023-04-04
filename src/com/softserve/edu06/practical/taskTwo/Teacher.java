package com.softserve.edu06.practical.taskTwo;

public class Teacher extends Staff{
    private final TypePerson TYPE_PERSON = TypePerson.TEACHER;

    public Teacher() {
        System.out.println("Type person = " + TYPE_PERSON.name());
    }

    public Teacher(String name) {
        super(name);
        System.out.println("Type person = " + TYPE_PERSON.name());
    }

    @Override
    public String print() {
        return "I am a teacher";
    }

    @Override
    public double salary() {
        return 17_500;
    }
}
