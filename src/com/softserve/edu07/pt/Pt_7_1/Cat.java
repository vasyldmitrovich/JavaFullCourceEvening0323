package com.softserve.edu07.pt.Pt_7_1;

class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Meow!");
    }

    @Override
    public void feed() {
        System.out.println("Feeding the cat...");
    }
}