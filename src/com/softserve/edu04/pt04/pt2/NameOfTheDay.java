package com.softserve.edu04.pt04.pt2;


import java.util.Scanner;

public class NameOfTheDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of weekday");
        namesOfWeekDay(scanner.nextInt());
    }

    private static void namesOfWeekDay(int number) {
        switch (number) {
            case (1):
                System.out.println("Monday/Понедiлок");
                break;
            case (2):
                System.out.println("Tuesday/Вiвторок");
                break;
            case (3):
                System.out.println("Wednesday/Середа");
                break;
            case (4):
                System.out.println("Thursday/Четверг");
                break;
            case (5):
                System.out.println("Friday/Пятниця");
                break;
            case (6):
                System.out.println("Saturday/Cубота");
                break;
            case (7):
                System.out.println("Sunday/Недiля");
                break;
        }
    }
}
