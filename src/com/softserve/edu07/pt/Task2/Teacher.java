package com.softserve.edu07.pt.Task2;

public class Teacher extends Staff {
    private final String TYPE_PERSON = "Staff - Teacher";

    public Teacher() {
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    public Teacher(String name) {
        super(name);
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public void print(){
        System.out.println("Im a teacher from staff");
    }

    @Override
    public void salary() {
        System.out.println("my salary is big `cause Im teacher from SofServe academy");
    }
}
