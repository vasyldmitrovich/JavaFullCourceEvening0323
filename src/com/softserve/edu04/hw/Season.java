package com.softserve.edu04.hw;

public enum Season {
    WINTER("Winter", 150),
    SPRING("Spring", 245),
    SUMMER("Summer", 132),
    AUTUMN("Autumn", 184);

    private final String en;
    private final int stud;

    Season(String en, int stud) {
        this.en = en;
        this.stud = stud;
    }

    public String getEn() {
        return en;
    }

    public int getStud() {
        return stud;
    }
}
