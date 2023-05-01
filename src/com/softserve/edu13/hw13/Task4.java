package com.softserve.edu13.hw13;

import java.time.LocalDate;
import java.time.Month;

public class Task4 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1996, Month.JANUARY, 31);
        System.out.println("My birthday - "+localDate);
        showDays(localDate);
    }

    //Good
    private static void showDays (LocalDate localDate){
        LocalDate newDate1 = localDate.plusMonths(6);
        LocalDate newDate2 = localDate.plusMonths(12);
        String day1 = newDate1.now().getDayOfWeek().name();
        String day2 = newDate2.now().getDayOfWeek().name();
        System.out.println("Day of the week after 6 month from your birthday "+day1);
        System.out.println("Day of the week after 12 month from your birthday "+day2);
    }
}

