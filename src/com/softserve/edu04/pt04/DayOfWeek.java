package com.softserve.edu04.pt04;

public enum DayOfWeek {
    MONDAY("Понеділок", "Monday"),
    TUESDAY("Вівторок", "Tuesday"),
    WEDNESDAY("Середа", "Wednesday"),
    THURSDAY("Четвер", "Thursday"),
    FRIDAY("П'ятниця", "Friday"),
    SATURDAY("Субота", "Saturday"),
    SUNDAY("Неділя", "Sunday");

    private final String dayNameUkr;
    private final String dayNameEng;

    DayOfWeek(String dayNameUkr, String dayNameEng) {
        this.dayNameUkr = dayNameUkr;
        this.dayNameEng = dayNameEng;
    }

    public String getDayNameUkr() {
        return dayNameUkr;
    }

    public String getDayNameEng() {
        return dayNameEng;
    }
}
