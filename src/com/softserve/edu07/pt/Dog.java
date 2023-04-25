package com.softserve.edu07.pt;

public class Dog implements Animal{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(){}

    public String voice(){
        return name + " says BARK";
    }

    public String feed(){
        return name + " says: \"Where's my sausage?\"";
    }
}
