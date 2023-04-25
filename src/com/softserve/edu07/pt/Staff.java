package com.softserve.edu07.pt;

public class Staff extends Person{

    public Staff() {}

    public Staff(String name){
        super(name);
    }

    @Override
    public String print() {
        return "I am a ";
    }

    public void salary(){};
}
