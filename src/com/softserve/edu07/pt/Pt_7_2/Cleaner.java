package com.softserve.edu07.pt.Pt_7_2;

class Cleaner extends Person {
    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON+" "+name);
    }

    public void salary() {
        System.out.println("Salary for " + TYPE_PERSON + " " + name + " is 2000$");
    }
}