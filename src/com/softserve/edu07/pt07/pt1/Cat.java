package com.softserve.edu07.pt07.pt1;

public class Cat implements Animal{
    @Override
    public void voice() {
        System.out.println("Meow-meow");
    }

    @Override
    public void feed() {
        System.out.println("Cat it eating");
    }
}
