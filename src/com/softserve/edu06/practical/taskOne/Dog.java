package com.softserve.edu06.practical.taskOne;

public class Dog implements Animal{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String voice() {
        return "Gav-Gav my name is "+name;
    }

    @Override
    public String feed() {
        return "I dog and like eat bone!";
    }
}
