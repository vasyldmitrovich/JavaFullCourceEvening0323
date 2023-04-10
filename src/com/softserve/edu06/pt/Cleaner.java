package com.softserve.edu06.pt;

public class Cleaner extends Staff{
    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    public void print() {
        System.out.println("I am a " + TYPE_PERSON+" "+name);
    }

    public int salary() {
        return 1000;
    }
}
