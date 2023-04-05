package com.softserve.edu07.pt07.task1;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Woof!");
    }

    @Override
    public void feed() {
        System.out.println("Feeding the dog.");
    }
}
