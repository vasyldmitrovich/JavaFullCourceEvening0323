package com.softserve.edu04.hw4;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanStudent = new Scanner(System.in);
        System.out.print("Enter number of student: ");
        int numOfStudent = scanStudent.nextInt();
        System.out.print("Enter season '1-Winter, 2-Spring, 3-Summer, 4-Autumn': ");
        int seasonNum = scanStudent.nextInt();
        String season = null;
        if (seasonNum == 1) {
            season = CurrentSeason.WINTER.getName();
        } else if (seasonNum == 2) {
            season = CurrentSeason.SPRING.getName();
        } else if (seasonNum == 3) {
            season = CurrentSeason.SUMMER.getName();
        } else if (seasonNum == 4) {
            season = CurrentSeason.AUTUMN.getName();
        }
        System.out.println("Number of student: " + numOfStudent + "." + " Season: " + season);
    }
}
