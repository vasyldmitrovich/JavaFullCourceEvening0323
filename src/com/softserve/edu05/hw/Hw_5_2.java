package com.softserve.edu05.hw;

import java.util.Scanner;

public class Hw_5_2 {
    public static void main(String[] args) {
        sum_calc();

    }

    public static void sum_calc() {
        Scanner sc = new Scanner(System.in);

        String answer;
        do {
            System.out.println("Enter First number: ");
            int first = sc.nextInt();

            System.out.println("Enter Second number: ");
            int second = sc.nextInt();

            System.out.println("Sum of 2 numbers is: " + (first + second));

            System.out.println("Do you want to perform the operation again?(Yes/No): ");
            answer = sc.next();

        } while (answer.equalsIgnoreCase("Yes"));

        System.out.println("The work has done");

    }


}



