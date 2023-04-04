package com.softserve.edu05.hw.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, check, sum;
        do{
            System.out.print("Enter first number: ");
            num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            num2 = scanner.nextInt();
            sum = num1 + num2;
            System.out.println("Their sum is: " + sum);
            System.out.println("Would you like to try again?\n1 - Yes\n2 - No");
            check = scanner.nextInt();
        }while (check != 2);
        System.out.println("Bye bye");
    }
}
