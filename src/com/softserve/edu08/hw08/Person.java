package com.softserve.edu08.hw08;

public abstract class Person {
    public FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {

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
        return "First Name='" + fullName.getFirstName() + '\'' +
                ", Last Name='" + fullName.getLastName() + '\'' +
                ", Age=" + age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "fullName=" + fullName +
                ", age=" + age +
                '}';
    }

    //Do not need using words public abstract, java add this words to method by default
    public abstract String activity();

}
