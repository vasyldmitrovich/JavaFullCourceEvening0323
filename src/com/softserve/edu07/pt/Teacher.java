package com.softserve.edu07.pt;

public class Teacher extends Staff {
    private final String TYPE_PERSON = "teacher";

    public Teacher() {
        System.out.println("This is a " + TYPE_PERSON);
    }

    public Teacher(String name) {
        super(name);
        System.out.println("This is a " + TYPE_PERSON);
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public String print() {
        return super.print() + TYPE_PERSON;
    }

    @Override
    public void salary() {
        System.out.println(TYPE_PERSON + "'s salary.");;
    }
}
