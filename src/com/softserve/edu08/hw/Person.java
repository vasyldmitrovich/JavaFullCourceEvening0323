package com.softserve.edu08.hw;

public abstract class Person {
    protected FullName fullName;
    protected int age;

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

    public String info() {
        String info = "First name: " + fullName.getFirstName()
                + ", Last name: " + fullName.getLastName()
                + ", Age: " + age;
        return info;
    }

    //Without words public and abstract
    public abstract String activity();

    @Override
    public String toString() {
        return "Person{" +
                "fullName=" + fullName +
                ", age=" + age +
                '}';
    }
}
