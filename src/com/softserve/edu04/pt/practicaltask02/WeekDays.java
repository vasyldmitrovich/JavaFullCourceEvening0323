package com.softserve.edu04.pt.practicaltask02;

public enum WeekDays {

    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четвер"),
    FRIDAY("Friday", "Пятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    private final String ua;
    private final String en;

    WeekDays(String en, String ua) {
        this.en = en;
        this.ua = ua;
    }

    public String getUa() {
        return ua;
    }

    public String getEn() {
        return en;
    }
}
