package com.softserve.edu08.hm08;

abstract class Person implements Cloneable{
    private FullName fullName;
    private int age;

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


    // Abstract method for displaying person information
    public void setAge(int age) {
        this.age = age;
    }

    // Abstract method for person's activity
    void info() { };

    String activity() {
        return null;
    };

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
