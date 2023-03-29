package com.softserve.edu05.hw05.hw1;


public class Months {
    public static int numberOfDays(int number) {
        int months[] = {31, 31, 29, 31, 30, 31, 30, 30, 31, 31, 30, 31, 30};
        for (int i = 0; i < months.length; i++) {
            if (i == number) {
                return months[i];
            }
        }
        return 0;
    }
}
