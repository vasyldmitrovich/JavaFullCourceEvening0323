package com.softserve.edu04.pt;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number day of week?)");
        int number = sc.nextInt();
        //Day of the weak must be enum not string
        var result = switch (number) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "eror404";
        };
        System.out.println(result);
    }
}
