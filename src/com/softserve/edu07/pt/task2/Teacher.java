package com.softserve.edu07.pt.task2;

public class Teacher extends Staff {

    private static final String TYPE_PERSON = "Teacher";

    public Teacher() {
        System.out.println(TYPE_PERSON);
    }

    public Teacher(String name) {
        super(name);
        System.out.println(TYPE_PERSON);
    }

    public Teacher(String name, int salary) {
        super(name, salary);
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a teacher");
    }

    @Override
    public void salary() {
        System.out.println("Teacher's salary is " + this.getSalary());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
