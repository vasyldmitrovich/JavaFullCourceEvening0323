package com.softserve.edu04.hw.Task5;

public enum Breed {
    AKITA("Akita"),
    BULLDOGS("Bulldogs"),
    HUSKY("Husky"),
    POODLES("Poodles"),
    RETRIEVERS("Retrievers"),
    ROTTWEILERS("Rottweilers");

    private final String breedName;

    Breed(String breedName) {
        this.breedName = breedName;
    }

    public String getBreedName() {
        return breedName;
    }
}
