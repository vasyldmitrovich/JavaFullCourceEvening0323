package com.softserve.edu04.hw04.task4;

public enum CurrentSeason {
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    FALL("Fall");
    private final String name;

    CurrentSeason(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}