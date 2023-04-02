package com.softserve.edu03.pt;


/*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!On your computer
 * how I see
 * you did not mark in blue color folder src
 * I suggest you marked each folder in blue, it is not good
 * PLEASE mark directory src in blue colour
 * because I must reformat in each class package*/



import java.util.Scanner;
public class TotalAndAverageCounter {
    public static void main(String[] args) {
        int a = getNumber("first");
        int b = getNumber("second");

        System.out.println("The sum of " + a + " and " + b + " is " + getTotal(a, b));
        System.out.println("The average of " + a + " and " + b + " is " + getAverage(a, b));

    }

    static int getNumber(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the " + prompt + " number: ");

        return sc.nextInt();
    }

    static int getTotal(int a, int b){
        return a + b;
    }

    /*If you calculate the average in this way, you will have an error in the calculation, a rounding error*/
    static double getAverage(int a, int b){
        return Math.round((getTotal(a, b) / 2) + 100) / 100d;//changed.
    }
}

