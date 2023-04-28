package com.softserve.edu08.hw;

public abstract class Person {
    private FullName fullName;
    private int age;

    public Person(){}

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

    public String info(){
        return String.format("First name: %s, Last name: %s, Age: %d", fullName.getFirstName(), fullName.getLastName(), age);
    }

    public String activity(){
        return null;
    }
}
