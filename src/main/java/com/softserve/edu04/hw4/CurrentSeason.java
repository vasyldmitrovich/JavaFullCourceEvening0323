package com.softserve.edu04.hw4;

public enum CurrentSeason {
    WINTER("Winter"), SPRING("Spring"), SUMMER("Summer"), AUTUMN("Autumn");

    private final String name;

    CurrentSeason(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
