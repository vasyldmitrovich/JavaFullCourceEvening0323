package com.softserve.edu04.hw;

import java.util.Scanner;

public class AppH_4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of students --> ");
        int a = sc.nextInt();

        switch (a) {
            case 150:
                System.out.print("We have " + Season.WINTER.getStud() + " students ");
                System.out.print(" in " + Season.WINTER.getEn() + " season");
                break;
            case 245:
                System.out.print("We have " + Season.SPRING.getStud() + " students ");
                System.out.print(" in " + Season.SPRING.getEn() + " season");
                break;
            case 132:
                System.out.print("We have " + Season.SUMMER.getStud() + " students ");
                System.out.print(" in " + Season.SUMMER.getEn() + " season");
                break;
            case 184:
                System.out.print("We have " + Season.AUTUMN.getStud() + " students ");
                System.out.print(" in " + Season.AUTUMN.getEn() + " season");
                break;
            default:
                System.out.println("We don't have this count of students at any season !!! ");
        }
    }
}
