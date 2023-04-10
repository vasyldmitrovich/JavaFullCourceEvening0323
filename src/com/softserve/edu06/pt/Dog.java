package com.softserve.edu06.pt;

public class Dog implements Animal{
    @Override
    public String voice() {
        return "Woof!";
    }

    @Override
    public String feed() {
        return "Meat";
    }

     Dog() {
    }
}

