package com.softserve.edu04.pt.Task3;

public enum Continent {
    EURASIA("Євразія"),
    AFRICA("Африка"),
    AUSTRALIA("Австралія"),
    NORTH_AMERICA("Північна Америка"),
    SOUTH_AMERICA("Південна Америка"),
    ANTARCTICA("Антарктида");

    private final String contName;

    Continent(String contName) {
        this.contName = contName;
    }

    public String getContName() {
        return contName;
    }
}
