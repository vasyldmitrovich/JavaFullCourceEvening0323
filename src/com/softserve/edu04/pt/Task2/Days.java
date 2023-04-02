package com.softserve.edu04.pt.Task2;

public enum Days {
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четвер"),
    FRIDAY("Friday", "П'ятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    private final String en;
    private final String ua;

    Days(String en, String ua) {
        this.en = en;
        this.ua = ua;
    }

    public String getEn() {
        return this.en;
    }

    public String getUa() {
        return this.ua;
    }

    public static String findDay(int num) {
        Days days = null;
        switch (num) {
            case 1 -> days = Days.MONDAY;
            case 2 -> days = Days.TUESDAY;
            case 3 -> days = Days.WEDNESDAY;
            case 4 -> days = Days.THURSDAY;
            case 5 -> days = Days.FRIDAY;
            case 6 -> days = Days.SATURDAY;
            case 7 -> days = Days.SUNDAY;
            default -> {
                return "Incorrect number of day";
            }
        }
        return "In english - " + days.getEn() + "\nУкраїнською - " + days.getUa();
    }

}