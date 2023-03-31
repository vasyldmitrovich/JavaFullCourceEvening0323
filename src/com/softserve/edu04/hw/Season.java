package com.softserve.edu04.hw;

enum Season {
    WINTER("Winter", 342),
    SPRING("Spring", 543),
    SUMMER("Summer", 412),
    FALL("Fall", 235);
    private final String se;
    private final int stud;

    Season(String se, int stud) {
        this.se = se;
        this.stud = stud;

    }

    public String getSe() {
        return se;
    }

    public int getStud() {
        return stud;
    }

}
