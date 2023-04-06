package com.softserve.edu04.hw;

import java.util.Scanner;

public class Faculty {
    enum Season {
        WINTER("Winter"), SPRING("Spring"), SUMMER("Summer"), FALL("Fall");

        private final String name;


        Season(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    private final String nameOfStudents;

    private final int ageOfStudent;

    private final Season currentSeason;

    public Faculty(String nameOfStudents, Season currentSeason, int ageOfStudent) {
        this.nameOfStudents = nameOfStudents;
        this.ageOfStudent = ageOfStudent;
        this.currentSeason = currentSeason;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of students: ");
        String nameOfStudents = input.nextLine();
        System.out.println("Enter the age of student  ");
        int ageOfStudent = input.nextInt();
        System.out.println("Enter the current season 1(Winter), 2(Spring), 3(Summer), 4(Fall): ");
        int seasonChoice = input.nextInt();

        Season currentSeason;
        switch (seasonChoice) {
            case 1 -> currentSeason = Season.WINTER;
            case 2 -> currentSeason = Season.SPRING;
            case 3 -> currentSeason = Season.SUMMER;
            case 4 -> currentSeason = Season.FALL;
            default -> {
                System.out.println("Invalid season choice. Using default season: Winter");
                currentSeason = Season.WINTER;
            }
        }

        Faculty faculty = new Faculty(nameOfStudents, currentSeason, ageOfStudent);

        System.out.println("Faculty created. Name of students: " + faculty.nameOfStudents);
        System.out.println("Age of student: " + faculty.ageOfStudent);
        System.out.println("Current season: " + faculty.currentSeason.getName());
    }
}
