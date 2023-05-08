package com.softserve.edu04.hw4;

public enum Breed {
    DACHSHUND("Dachshund"), JACK_RUSSELL("Jack russell"), CORGI("Corgi"), LABRADOR("Labrador");

    private final String name;

    Breed(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
