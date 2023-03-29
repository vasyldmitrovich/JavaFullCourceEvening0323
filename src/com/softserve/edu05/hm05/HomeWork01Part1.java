package com.softserve.edu05.hm05;

import java.util.Scanner;

public class HomeWork01Part1 {
    public static void main(String[] args) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();

        int days = daysInMonth[month-1];

        System.out.printf("У місяці %s є %s днів.", month, days);
    }
}