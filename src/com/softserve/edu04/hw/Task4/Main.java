package com.softserve.edu04.hw.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter season: ");
        String tempSeason = scanner.nextLine();
        System.out.println("Enter number of students: ");
        int numOfStudents = scanner.nextInt();
        Season season = null;
        for (Season engName : Season.values()) {
            if (engName.getSeasons().equalsIgnoreCase(tempSeason)) {
                season = engName;
                break;
            }
        }
        Faculty faculty = new Faculty(numOfStudents, season);
        System.out.println(faculty.toString());
    }
}
