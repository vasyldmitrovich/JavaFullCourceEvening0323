package com.softserve.edu07.pt07.pt2;

public class Cleaner extends Staff {

    private final String TYPE_PERSON = "Cleaner";
    private final int SALARY = 15000;

    public Cleaner() {
        System.out.println(TYPE_PERSON+" created");
    }

    @Override
    public void print() {
        System.out.println("I'm a cleaner person");
    }

    @Override
    public void salary() {
        System.out.println("My salary is "+SALARY);
    }
}
