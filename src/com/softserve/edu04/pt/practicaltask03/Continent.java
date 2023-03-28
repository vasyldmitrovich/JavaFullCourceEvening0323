package com.softserve.edu04.pt.practicaltask03;

public enum Continent {

    AFRICA("Africa"), ASIA("Asia"), EUROPE("Europe"),
    NORTH_AMERICA("North America"), SOUTH_AMERICA("South America"),
    ANTARCTICA("Antarctica"), AUSTRALIA("Australia and Oceania");
    private final String name;

    Continent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
