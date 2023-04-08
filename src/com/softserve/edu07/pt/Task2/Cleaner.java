package com.softserve.edu07.pt.Task2;

public class Cleaner extends Staff{
    private final String TYPE_PERSON = "Staff - Cleaner";

    public Cleaner() {
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    public Cleaner(String name) {
        super(name);
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public void print(){
        System.out.println("Im a cleaner from staff");
    }

    @Override
    public void salary() {
        System.out.println("my salary is small");
    }
}
