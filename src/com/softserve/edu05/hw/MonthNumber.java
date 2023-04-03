package com.softserve.edu05.hw;

import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args) {
        days();
    }

    public static void days() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of month --> ");
        int a = sc.nextInt();
        int arr[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        switch (a) {
            case 1:
                System.out.println("In this month we have " + arr[0] + " days");
                break;
            case 2:
                System.out.println("In this month we have " + arr[1] + " days");
                break;
            case 3:
                System.out.println("In this month we have " + arr[2] + " days");
                break;
            case 4:
                System.out.println("In this month we have " + arr[3] + " days");
                break;
            case 5:
                System.out.println("In this month we have " + arr[4] + " days");
                break;
            case 6:
                System.out.println("In this month we have " + arr[5] + " days");
                break;
            case 7:
                System.out.println("In this month we have " + arr[6] + " days");
                break;
            case 8:
                System.out.println("In this month we have " + arr[7] + " days");
                break;
            case 9:
                System.out.println("In this month we have " + arr[8] + " days");
                break;
            case 10:
                System.out.println("In this month we have " + arr[9] + " days");
                break;
            case 11:
                System.out.println("In this month we have " + arr[10] + " days");
                break;
            case 12:
                System.out.println("In this month we have " + arr[11] + " days");
                break;

        }
    }
}
