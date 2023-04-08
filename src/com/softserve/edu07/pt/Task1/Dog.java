package com.softserve.edu07.pt.Task1;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("ufff ufff!!");
    }

    @Override
    public void feed() {
        System.out.println("uffff ufff (very tasty)");
    }
}
