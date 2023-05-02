package com.softserve.edu13.hm13;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class HomwWork4 {
    private final LocalDate birthday;

    public HomwWork4() {
        // Set the birthday variable to your own birthday
        this.birthday = LocalDate.of(1990, 12, 20); // Replace with your own birthday
    }//Glad to see explanation in comments what user should do

    public void printDayOfWeek(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Day of the week: " + dayOfWeek);

        LocalDate date6MonthsLater = date.plusMonths(6);
        DayOfWeek dayOfWeek6MonthsLater = date6MonthsLater.getDayOfWeek();
        System.out.println("Day of the week 6 months later: " + dayOfWeek6MonthsLater);

        LocalDate date12MonthsLater = date.plusMonths(12);
        DayOfWeek dayOfWeek12MonthsLater = date12MonthsLater.getDayOfWeek();
        System.out.println("Day of the week 12 months later: " + dayOfWeek12MonthsLater);
    }

    public static void main(String[] args) {
        HomwWork4 bday = new HomwWork4();
        bday.printDayOfWeek(bday.birthday);
    }
}
