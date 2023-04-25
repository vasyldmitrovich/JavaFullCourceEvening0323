package com.softserve.edu13.hw13;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        System.out.println("If it's a leap year");
        System.out.println(ifTheLeap(year));
    }

    private static boolean ifTheLeap (int year){
        boolean isLeapYear = new GregorianCalendar().isLeapYear(year);
        return isLeapYear;
    }
}
