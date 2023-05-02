package com.softserve.edu13.pt.Task1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Show which today is a day of a week
        LocalDate today = LocalDate.now();
        DayOfWeek a = today.getDayOfWeek();
        System.out.println(a.name().toLowerCase());

        //Show a date of first Monday for current month
        LocalDate firstMonday = today.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(firstMonday);


        //Nice to see that there is an implementation in three different ways, well done

        //Write a method for sorting list of Strings using Java 8
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "watermelon", "kiwi", "orange"));
        //list.sort((o1, o2) -> o1.compareTo(o2));
        //list.stream().sorted().collect(Collectors.toList());
        list.sort(String::compareTo);
        System.out.println(list);


//        Create array Integers which has 10 elements, create method count() that takes an array
//        of integers as the first parameter and functional interface as the second parameter,
//        that functional interface works with integers and defines a condition. Method count()
//        return count of elements in array that satisfy the condition defined by the second
//        argument.
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Functional functional = x -> x % 2 == 0;
        System.out.println(count(arr, functional));

    }
    private static int count(int[] arr, Functional functional){//It is good
        int count = 0;
        for (int i : arr) {
            if (functional.check(i)) {
                count++;
            }
        }
        return count;
    }

}
