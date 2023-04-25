package com.softserve.edu07.pt;

public class Cat implements Animal{
    private String name;

    public Cat() {}

    public Cat(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String voice(){
        return name + " says meow!";
    }

    public String feed(){
        return name + " wants a fish?";
    }
}
