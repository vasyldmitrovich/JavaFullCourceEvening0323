package com.softserve.edu12.practical;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Show which today is a day of a week");
        System.out.println(showDayToday());
        System.out.println("Show a date of first Monday for current month");
        System.out.println(showDateForFirstMonday());
        System.out.println("Write a method for sorting list of Strings using Java 8");
        SortString sortString = (String ...strings)->{
            return Arrays.stream(strings)
                    .sorted((s1,s2)->s1.length() > s2.length() ? 1 : s1.length() == s2.length() ? 0 : -1)
                    .collect(Collectors.toList())
                    .toArray(String[]::new);
        };
        System.out.println(Arrays.toString(sortString.sortedString("love", "java","i")));
        System.out.println("Four task in practical");
        Integer[] numberArray = fullTask();
        System.out.println("Count elements in array that satisfy the condition = "+count(numberArray,(number -> number > 10)));
    }

    public static int count(Integer[] numberArrays, NumberService numberService){
        int count = 0;
        for(Integer number : numberArrays){
            if(numberService.checkNumber(number)){
                count++;
            }
        }
        return count;
    }
    public static Integer[] fullTask(){
        return new Integer[]{3, 2, 52, 35, 15, 2, 5, 3, 4, 11};
    }

    public static String showDayToday(){
        return LocalDateTime.now().getDayOfWeek().name();
    }

    public static String showDateForFirstMonday(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH,1);
        while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        return calendar.getTime().toString();
    }

}
