package com.softserve.edu04.hw.Task4;

public enum Season {

    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    private final String season;

    Season(String season){
        this.season = season;
    }

    public String getSeasons() {
        return season;
    }
}
