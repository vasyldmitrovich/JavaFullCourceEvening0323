package com.softserve.edu13.pt13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DateOfWeek {

    public static void main(String[] args) {//Good
        //task1
        DateOfWeek example = new DateOfWeek();
        System.out.println("Today is " + example.getDayOfWeek());

        //task2
        DateOfWeek exampleForTask2 = new DateOfWeek();
        System.out.println("The first Monday of this month is on " + example.getFirstMondayOfMonth());

        //task3
        DateOfWeek exampleForTask3 = new DateOfWeek();
        List<String> stringList = Arrays.asList("cat", "dog", "apple", "banana", "zebra");
        List<String> sortedList = exampleForTask3.sortStrings(stringList);
        System.out.println("Original list: " + stringList);
        System.out.println("Sorted list: " + sortedList);

    }


    //task1
    public DayOfWeek getDayOfWeek() {
        LocalDate today = LocalDate.now();
        return today.getDayOfWeek();
    }

    //task2
    public LocalDate getFirstMondayOfMonth() {
        LocalDate today = LocalDate.now();
        LocalDate firstDayOfMonth = today.withDayOfMonth(1);
        DayOfWeek dayOfWeek = firstDayOfMonth.getDayOfWeek();
        int daysUntilFirstMonday = DayOfWeek.MONDAY.getValue() - dayOfWeek.getValue();
        if (daysUntilFirstMonday < 0) {
            daysUntilFirstMonday += 7;
        }
        return firstDayOfMonth.plusDays(daysUntilFirstMonday);
    }


    //task3
    public List<String> sortStrings(List<String> stringList) {
        return stringList.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
