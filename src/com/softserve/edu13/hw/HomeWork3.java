package com.softserve.edu13.hw;

public class HomeWork3 {
    public static void main(String[] args) {
        int year = 2023;
        boolean isLeap = isYearLeap(year);
        System.out.println(isLeap);
    }

    public static boolean isYearLeap(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
}
