package com.softserve.edu08.hw;

public abstract class Person implements Cloneable{
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    //____
    public int getAge() {
        return age;
    }

    public FullName getFullName() {
        return fullName;
    }
//____
    public String info() {
        return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + "<"+age+">";
    }

    public abstract String activity();


}
