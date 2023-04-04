package com.softserve.edu06.practical.taskOne;

public class Cat implements Animal{
    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String voice() {
        return "Mya-Mya My name is "+name;
    }

    @Override
    public String feed() {
        return "I cat and like eat fish!";
    }
}
