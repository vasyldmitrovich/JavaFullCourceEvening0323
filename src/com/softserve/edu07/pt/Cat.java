package com.softserve.edu07.pt;

public class Cat implements Animal {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Мяу!");
    }

    @Override
    public void feed() {
        System.out.println("Я їм Whiskas.");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
