package com.softserve.edu04.hw.homework04;

public enum Season {

    WINTER("Winter"), AUTUMN("Autumn"), SUMMER("Summer"), SPRING("Spring");
    private final String name;

    Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
