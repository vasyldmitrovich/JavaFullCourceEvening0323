package com.softserve.edu04.pt;

public enum DaysOfTheWeek{
    MONDAY(1,"Monday","Понеділок"),
    TUESDAY(2,"Tuesday","Вівторок"),
    WEDNESDAY(3,"Wednesday","Середа"),
    THURSDAY(4,"Thursday","Четвер"),
    FRIDAY(5,"Friday","П'ятниця"),
    SATURDAY(6,"Saturday","Субота"),
    SUNDAY(7,"Sunday","Неділя");

    private String en, uk;
    private int num;

    private DaysOfTheWeek(int num, String en, String uk){
        this.num = num;
        this.en = en;
        this.uk = uk;
    }

    @Override
    public String toString(){
        return en + " (en) / " + uk + " (uk)";
    }

    public static String getTheDayByNumber(int num){
        if (num < 1 || num > 7){
            return "ERROR!!! WRONG DAY'S NUMBER!";
        }

        switch(num){
            case 1: return MONDAY.toString();
            case 2: return TUESDAY.toString();
            case 3: return WEDNESDAY.toString();
            case 4: return THURSDAY.toString();
            case 5: return FRIDAY.toString();
            case 6: return SATURDAY.toString();
            default : return SUNDAY.toString();
        }
    }
}