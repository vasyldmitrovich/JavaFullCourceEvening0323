package com.softserve.apps;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number greater than one: ");
        int n = sc.nextInt();
        int steps = findStepsToReachOne(n);
        System.out.println("Number of steps to reach 1: " + steps);
    }

    //The method finds the number of steps for which the result is 1 if it is even or odd
    public static int findStepsToReachOne(int n) {
        int steps = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            steps++;
        }
        return steps;
    }
 public static void print(){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a natural number greater than one: ");
     int n = sc.nextInt();
     int steps = findStepsToReachOne(n);
     System.out.println("Number of steps to reach 1: " + steps);
 }
}
