package com.softserve.edu04.hw04.task4;

import java.util.Scanner;

public class Faculty {
    private int numStudents;
    private CurrentSeason currentSeason;

    public Faculty(int numStudents, CurrentSeason currentSeason) {
        this.numStudents = numStudents;
        this.currentSeason = currentSeason;
    }

    public void printInfo() {
        System.out.println("Number of students: " + numStudents);
        System.out.println("Current season: " + currentSeason.getName());
    }
}