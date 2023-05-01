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

    //Why constructor have access modifier package-private ??? How you can create Cat from another package???
     Cat() {
    }
}
