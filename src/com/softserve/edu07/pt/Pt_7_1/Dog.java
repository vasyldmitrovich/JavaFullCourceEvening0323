package com.softserve.edu07.pt.Pt_7_1;

class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Woof!");
    }

    @Override
    public void feed() {
        System.out.println("Feeding the dog...");
    }
}