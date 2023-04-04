package com.softserve.edu05.hw.Task1;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Enter number of month");
        int numOfMonth = scanner.nextInt();
        System.out.print("In this month " + months[numOfMonth-1] + " days");
    }
}
