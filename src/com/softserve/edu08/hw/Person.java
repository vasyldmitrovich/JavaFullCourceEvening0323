package com.softserve.edu08.hw;

abstract class Person implements Cloneable{
    private FullName fullName;
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

    public String info(){
        return "First name:"+ "<"+ getFullName().getFirstName() +">" + "Last name:" + "<" + getFullName().getLastName()+ ">"+
                "Age:" + "<"+ getAge() + ">";
    }
    abstract public String activity();
}
