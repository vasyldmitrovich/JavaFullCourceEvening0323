package com.softserve.edu04.pt;

import java.util.Scanner;

public class AppP_4_2 {
    public static void main(String[] args) {
        dayName();

    }

    public static void dayName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number --> ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Your day is -- >" + Day.First.getEn() + " - " + Day.First.getUa());
                break;
            case 2:
                System.out.println("Your day is -- >" + Day.Second.getEn() + " - " + Day.Second.getUa());
                break;
            case 3:
                System.out.println("Your day is -- >" + Day.Third.getEn() + " - " + Day.Third.getUa());
                break;
            case 4:
                System.out.println("Your day is -- >" + Day.Fourth.getEn() + " - " + Day.Fourth.getUa());
                break;
            case 5:
                System.out.println("Your day is -- >" + Day.Fifth.getEn() + " - " + Day.Fifth.getUa());
                break;
            case 6:
                System.out.println("Your day is -- >" + Day.Sixth.getEn() + " - " + Day.Sixth.getUa());
                break;
            case 7:
                System.out.println("Your day is -- >" + Day.Seventh.getEn() + " - " + Day.Seventh.getUa());
                break;
            default:
                System.out.println("You enter wrong number !!!");
        }
    }
}
