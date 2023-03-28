package com.softserve.edu04.hw.homework04;

import java.util.Scanner;

public class FacultyApp {
    public static void main(String[] args) {
        Faculty faculty1 = new Faculty(getStudentsNumber(), getSeason());

        System.out.println();
        System.out.println("You've created faculty with follow data: ");
        System.out.println(faculty1);
    }

    public static int getStudentsNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of students: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static Season getSeason() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input season by number: ");
        System.out.println("1 - Autumn, ");
        System.out.println("2 - Winter, ");
        System.out.println("3 - Spring, ");
        System.out.println("4 - Summer ");
        String seasonNumber = scanner.nextLine();
        switch (seasonNumber) {
            case "1":
                return Season.AUTUMN;
            case "2":
                return Season.WINTER;
            case "3":
                return Season.SPRING;
            case "4":
                return Season.SUMMER;
            default:
                System.out.println("Wrong value");
                return null;
        }
    }
}
