package com.softserve.edu13.hw.Task4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {//All is good
        LocalDate birthday = LocalDate.of(2005, 3, 1);

        LocalDate localDate1 = birthday.plusMonths(6);
        LocalDate localDate2 = birthday.plusMonths(12);
        System.out.println("After 6 month: " + localDate1.getDayOfWeek().name().toLowerCase());
        System.out.println("After 12 month: " + localDate2.getDayOfWeek().name().toLowerCase());

    }
}
