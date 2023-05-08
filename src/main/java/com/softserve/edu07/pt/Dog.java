package com.softserve.edu07.pt;

public class Dog implements Animal {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Гав!");
    }

    @Override
    public void feed() {
        System.out.println("Я їм Pedigree.");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
