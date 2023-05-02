package com.softserve.edu07.homework;

public abstract class Person {
    private FullName fullName;
    private int age;

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

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info(){
        return "First name:"+fullName.getFirstName()+", Last name: "+fullName.getLastName()+", Age: "+age;
    }

    //Do not need words public abstract, java add this words by default
    public abstract String activity();
}
