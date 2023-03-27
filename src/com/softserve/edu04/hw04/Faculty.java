package com.softserve.edu04.hw04;

import java.util.Scanner;

public class Faculty {
    private final int numStudents;
    private CurrentSeason currentSeason;


    public Faculty() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        this.numStudents = scanner.nextInt();

        System.out.println("Enter the current season:");
        System.out.println("1. Spring");
        System.out.println("2. Summer");
        System.out.println("3. Fall");
        System.out.println("4. Winter");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> this.currentSeason = CurrentSeason.SPRING;
            case 2 -> this.currentSeason = CurrentSeason.SUMMER;
            case 3 -> this.currentSeason = CurrentSeason.FALL;
            case 4 -> this.currentSeason = CurrentSeason.WINTER;
            default -> System.out.println("Invalid choice.");
        }
    }

    public void display() {
        System.out.println("Number of students: " + this.numStudents);
        System.out.println("Current season: " + this.currentSeason.getName());
    }

    public static void main(String[] args) {
        Faculty faculty = new Faculty();
        faculty.display();
    }

}