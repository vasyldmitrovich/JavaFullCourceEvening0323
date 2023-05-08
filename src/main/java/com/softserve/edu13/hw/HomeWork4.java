package com.softserve.edu13.hw;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class HomeWork4 {
    public static void main(String[] args) {
        LocalDate myBirthday = LocalDate.of(1988, 1, 28);
        System.out.println(myBirthday);
        printDayOfWeek(myBirthday);
    }

    public static void printDayOfWeek(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Day for " + date + " is " + dayOfWeek);
        LocalDate sixMonth = date.plusMonths(6);
        DayOfWeek daySixMonth = sixMonth.getDayOfWeek();
        System.out.println("Day of week for " + sixMonth + " is " + daySixMonth);
        LocalDate twelveMonth = date.plusMonths(12);
        DayOfWeek dayTwelveMonth = twelveMonth.getDayOfWeek();
        System.out.println("Day of week for " + twelveMonth + " is " + dayTwelveMonth);
    }
}
