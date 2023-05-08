package com.softserve.edu07.pt;

public class Teacher extends Staff {
    public static final String TYPE_PERSON = "Teacher";

    public Teacher(String name, double income) {
        super(name, income);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON + ". My name is " + name + ".");
    }

    public void salary() {
        System.out.println(TYPE_PERSON + " " + name + " have salary " + income);
    }
}

