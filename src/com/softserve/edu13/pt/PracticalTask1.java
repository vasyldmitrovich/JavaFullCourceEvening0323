package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.util.*;
import java.util.function.IntPredicate;

import static java.time.temporal.TemporalAdjuster.*;
import static java.time.temporal.TemporalAdjusters.firstInMonth;
import static java.time.temporal.TemporalAdjusters.previous;

public class PracticalTask1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        String dayToday = today.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        System.out.println("Today: " + dayToday.toUpperCase());

        LocalDate firstMonday = today.with(firstInMonth(DayOfWeek.MONDAY));
        System.out.println("First monday in this month: " + firstMonday);

        List<String> names = Arrays.asList("Vitaliy", "Oleg", "Alex", "Dima", "Andriy");
        sortStrings(names);
        System.out.println(names.toString());//toString do not need write, it works automatically
        for (String name : names) {
            System.out.println(name);
        }

        Integer nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = count(nums, n -> n % 2 == 0);
        System.out.println("Even numbers: " + count);
    }

    public static void sortStrings(List<String> list) {
        Collections.sort(list);
    }

    //Good method, it is nice
    public static int count(Integer nums[], IntPredicate predicate) {
        int count = 0;
        for (int num : nums) {
            if (predicate.test(num)) {
                count++;
            }
        }
        return count;
    }
}
