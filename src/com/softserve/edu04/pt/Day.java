package com.softserve.edu04.pt;

public enum Day {
    First("Monday", "Понеділок"),
    Second("Tuesday", "Вівторок"),
    Third("Wednesday", "Середа"),
    Fourth("Thursday", "Четвер"),
    Fifth("Friday", "П'ятниця"),
    Sixth("Saturday", "Субота"),
    Seventh("Sunday", "Неділя");
    private final String en;
    private final String ua;

    Day(String en, String ua) {
        this.en = en;
        this.ua = ua;
    }

    public String getEn() {
        return en;
    }

    public String getUa() {
        return ua;
    }
}

