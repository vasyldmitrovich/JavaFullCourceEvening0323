package com.softserve.edu05.hw;

import java.util.Scanner;

public class HomeWork1Task1 {
    public static void main(String[] args) {
        int dayInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the month number from 1 to 12: ");
        int monthNumber = scan.nextInt();
        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println(monthNumber + " month has " + dayInMonth[monthNumber - 1] + " days.");
        } else {
            System.out.println("Error!");
        }
    }
}
