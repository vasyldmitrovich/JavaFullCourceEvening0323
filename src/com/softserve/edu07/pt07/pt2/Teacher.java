package com.softserve.edu07.pt07.pt2;

public class Teacher extends Staff {

    private final String TYPE_PERSON = "Teacher";
    private final int SALARY = 20000;

    public Teacher() {
        System.out.println(TYPE_PERSON+" created");
    }

    @Override
    public void print() {
        System.out.println("I'm a teacher person");
    }

    @Override
    public void salary() {
        System.out.println("My salary is "+SALARY);
    }
}
