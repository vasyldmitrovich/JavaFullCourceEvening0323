package com.softserve.edu08.hw.Task1_2;

public abstract class Person {
    private FullName fullName;
    private int age;

    public Person() {
    }

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String activity();

    public String info() {
        return "Firs name: " + fullName.getFirstName() +
                ", Last name: " + fullName.getLastName() +
                ", Age: " + age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person cloneOfPerson = (Person) super.clone();
        cloneOfPerson.fullName = (FullName) cloneOfPerson.fullName.clone();
        return cloneOfPerson;
    }
}
