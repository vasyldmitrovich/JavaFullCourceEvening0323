package com.softserve.edu04.hw;

public enum Seasons {
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    private String name;

    private Seasons(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
