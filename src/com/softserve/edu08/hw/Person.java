package com.softserve.edu08.hw;

public abstract class Person {
    FullName fullName;
    int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info(){
        return "First name: " + this.fullName.getFirstName()
                + ", Last name: " + this.fullName.getLastName()
                + ", Age: " + this.age;
    }

    public abstract String activity();
}
