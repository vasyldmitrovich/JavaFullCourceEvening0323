package com.softserve.edu04.hw04.task4;

import java.util.Scanner;

public class HomeWork04 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of students: ");
            int numStudents = scanner.nextInt();

            System.out.print("Enter the current season (0=WINTER, 1=SPRING, 2=SUMMER, 3=FALL): ");
            int seasonIndex = scanner.nextInt();
            CurrentSeason currentSeason = CurrentSeason.values()[seasonIndex];

            Faculty faculty = new Faculty(numStudents, currentSeason);
            faculty.printInfo();
    }
}

