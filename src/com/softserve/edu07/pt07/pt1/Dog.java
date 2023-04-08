package com.softserve.edu07.pt07.pt1;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Woof-woof");
    }

    @Override
    public void feed() {
        System.out.println("Dog it eating");
    }
}
