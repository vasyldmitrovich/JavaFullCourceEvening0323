package com.softserve.edu04.hw;

import java.util.Scanner;

public class Faculty {
    enum Season {
        WINTER("Winter"), SPRING("Spring"), SUMMER("Summer"), FALL("Fall");

        private String name;
        private int age;

        Season(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    private String nameOfStudents;

    private int ageOfStudent;

    private Season currentSeason;

    public Faculty(String nameOfStudents, Season currentSeason, int ageOfStudent) {
        this.nameOfStudents = nameOfStudents;
        this.currentSeason = currentSeason;
        this.ageOfStudent = ageOfStudent;
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
            case 1:
                currentSeason = Season.WINTER;
                break;
            case 2:
                currentSeason = Season.SPRING;
                break;
            case 3:
                currentSeason = Season.SUMMER;
                break;
            case 4:
                currentSeason = Season.FALL;
                break;
            default:
                System.out.println("Invalid season choice. Using default season: Winter");
                currentSeason = Season.WINTER;
        }

        Faculty faculty = new Faculty(nameOfStudents, currentSeason, ageOfStudent);

        System.out.println("Faculty created. Name of students: " + faculty.nameOfStudents);
        System.out.println("Age of student: " + faculty.ageOfStudent);
        System.out.println("Current season: " + faculty.currentSeason.getName());
    }
}
