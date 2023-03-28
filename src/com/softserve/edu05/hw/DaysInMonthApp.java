package com.softserve.edu05.hw;

import java.util.Scanner;

public class DaysInMonthApp {
    public static void main(String[] args) {
        Integer[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month's number: ");
        Integer monthNumber = scanner.nextInt();
        System.out.println("Days in month : " + daysInMonth[monthNumber-1]);
    }
}
