package com.softserve.edu07.pt;

public class Cleaner extends Staff {
    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name, double income) {
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
