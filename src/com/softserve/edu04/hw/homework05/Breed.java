package com.softserve.edu04.hw.homework05;

public enum Breed {
    GOLDEN_RETRIEVER("Golden Retriever"),
    LABRADOR("Labrador"),
    FRENCH_BULLDOG("French Bulldog"),
    BULLDOG("Bulldog"),
    POODLE("Poodle"),
    NEWFOUNDLAND("Newfoundland"),
    DALMATIAN("Dalmatian"),
    RUSSELL_TERRIER("Russell Terrier"),
    GERMAN_SHEPHERD_DOG("German Shepherd Dog");

    private final String name;

    Breed(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
