package com.softserve.edu04.pt04;

public enum Continent {
    EUROPE("Європа"),
    ASIA("Азія"),
    AFRICA("Африка"),
    NORTH_AMERICA("Північна Америка"),
    SOUTH_AMERICA("Південна Америка"),
    AUSTRALIA("Австралія"),
    ANTARCTICA("Антарктида");

    private final String continentName;

    Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }
}
