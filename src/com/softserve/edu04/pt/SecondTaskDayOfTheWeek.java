package com.softserve.edu04.pt;

import java.util.Scanner;
public class SecondTaskDayOfTheWeek {
    public static void main(String[] args) {
        int numberOfTheDay = getTheNumber();
        System.out.println("The " + numberOfTheDay + " is " + DaysOfTheWeek.getTheDayByNumber(numberOfTheDay));

    }

    static int getTheNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of the day in the week (1, 2, 3, 4, 5, 6, 7): ");

        return sc.nextInt();
    }
}