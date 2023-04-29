package com.softserve.edu13.hw.Task3;

public class Main {
    public static void main(String[] args) {
        int year = 2021;
        if (isLeapYear(year)) {
            System.out.println("Leap");
        } else {
            System.out.println("not leap");
        }

    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else return year % 400 == 0;
    }
}
