package com.softserve.edu07.pt.task2;

public class Cleaner extends Staff {

    private static final String TYPE_PERSON = "Cleaner";

    public Cleaner() {
        System.out.println(TYPE_PERSON);
    }

    public Cleaner(String name) {
        super(name);
        System.out.println(TYPE_PERSON);
    }

    public Cleaner(String name, int salary) {
        super(name, salary);
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a cleaner");
    }

    @Override
    public void salary() {
        System.out.println("Cleaner's salary is " + this.getSalary());
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
