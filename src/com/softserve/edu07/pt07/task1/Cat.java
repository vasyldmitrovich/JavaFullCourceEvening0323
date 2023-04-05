package com.softserve.edu07.pt07.task1;

public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Voice!");
    }

    @Override
    public void feed() {
        System.out.println("Feeding the cat.");
    }
}
