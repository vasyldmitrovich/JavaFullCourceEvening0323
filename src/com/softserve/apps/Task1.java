package com.softserve.apps;

import java.util.Scanner;

public class Task1 {
    public static void Fibonachi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int input = sc.nextInt();
        int first = 1;
        int second = 1;
        int next;

        System.out.print("Fibonacci sequence up to " + input + ": ");
        System.out.print(first + ", " + second);

        for (int i = 3; i <= input; i++) {
            next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }

    }
}

