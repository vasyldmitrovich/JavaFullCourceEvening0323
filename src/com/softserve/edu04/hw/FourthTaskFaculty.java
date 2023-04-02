package com.softserve.edu04.hw;

import java.util.Scanner;
public class FourthTaskFaculty {
    public static void main(String[] args) {

        String errors = "";
        int numberOfStudents = getNumber();
        if(numberOfStudents <= 0){
            errors = errors + "Incorrect number of students. The value must be bigger then 0";
        }

        String textSeason = getSeason();
        if (!(textSeason.equals("WINTER") || textSeason.equals("SPRING")
            || textSeason.equals("SUMMER") || textSeason.equals("AUTUMN"))){
            errors = errors + "Incorrect name of the season";
        }

        if(errors.isEmpty()){
            Faculty iT = new Faculty();
            iT.setNumberOfStudents(numberOfStudents);
            iT.setSeason(Seasons.valueOf(textSeason));
            System.out.println("The faculty was created successfully");
        } else {
            System.out.println(errors);
        }
    }

    static int getNumber(){
        System.out.print("Input number of students: ");
        return new Scanner(System.in).nextInt();
    }

    static String getSeason(){
        System.out.print("Input the season (winter, spring, summer, autumn): ");
        return new Scanner(System.in).next().toUpperCase();
    }
}
