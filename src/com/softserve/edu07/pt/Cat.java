package com.softserve.edu07.pt;

public class Cat implements Animal {
    @Override
    public String feed() {
       return "Fish";
    }

    @Override
    public String voice() {
        return "Meow!";

    }

     Cat() {
    }
}
