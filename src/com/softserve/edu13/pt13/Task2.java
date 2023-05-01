package com.softserve.edu13.pt13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Task2 {
    public static void main(String[] args) {
        //Good
        LocalDate localDate = LocalDate.now();
        TemporalAdjuster firstMonInMonth = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println("Date of first Monday for current month is "+localDate.with(firstMonInMonth));

    }
}
