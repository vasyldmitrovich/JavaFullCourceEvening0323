package com.softserve.edu04.hw;

import java.util.Scanner;

public class Hw_4_4 {
    public static void main(String[] args) {
        System.out.println("Enter thw amount of students: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input) {
            case 342:
                System.out.print("We had " + Season.WINTER.getStud() + " students ");
                System.out.println("In " + Season.WINTER.getSe());
                break;
            case 543:
                System.out.print("We had " + Season.SPRING.getStud() + " students ");
                System.out.print("In " + Season.SPRING.getSe());
                break;
            case 412:
                System.out.print("We had " + Season.SUMMER.getStud() + " students ");
                System.out.print("In " + Season.SUMMER.getSe());
                break;
            case 235:
                System.out.print("We had " + Season.FALL.getSe() + " students ");
                System.out.print("In " + Season.FALL.getStud());
                break;
            default:
                System.out.println("We have not got this amount of student ever!");

        }

    }
}
