package com.softserve.edu07.pt.task1;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("gav-gav");
    }

    @Override
    public void feed() {
        System.out.println("Dog eats cat");
    }
}
