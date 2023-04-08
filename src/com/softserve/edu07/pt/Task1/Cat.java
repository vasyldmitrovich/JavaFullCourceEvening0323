package com.softserve.edu07.pt.Task1;

public class Cat implements Animal{
    @Override
    public void voice() {
        System.out.println("meow meow!!");
    }

    @Override
    public void feed() {
        System.out.println("meow meow (omg, so delicious)");
    }
}
