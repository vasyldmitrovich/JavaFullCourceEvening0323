package com.softserve.edu01.hw;

import java.util.Arrays;

import java.util.Scanner;

public class HomeWorkPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = getNumber("Enter the first number: ", scanner);
        int num2 = getNumber("Enter the second number: ", scanner);
        int num3 = getNumber("Enter the second number: ", scanner);
        System.out.println(averageValue(num1, num2, num3));
    }

    public static int getNumber(String prompt, Scanner scanner) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            scanner.next();

        }
        return scanner.nextInt();
    }

    public static int averageValue(int num1, int num2, int num3) {
        int[] array = new int[3];
        array[0]=num1;array[1]=num2;array[2]=num3;
        Arrays.sort(array);
        return array[0];
    }
}
