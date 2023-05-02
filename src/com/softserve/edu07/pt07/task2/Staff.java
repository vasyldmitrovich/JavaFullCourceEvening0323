package com.softserve.edu07.pt07.task2;

public class Staff extends Person{
    final String TYPE_PERSON = "Staff";

    public Staff(String name) {
        super(name);
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    @Override
    public void print() {

    }

    public void salary() {
        System.out.println("Salary: ");
    }

}
