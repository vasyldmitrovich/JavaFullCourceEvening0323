package com.softserve.edu02.homework.taskTwo;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input first number: ");
        int numberOne = scanner.nextInt();
        System.out.print("Input second number: ");
        int numberTwo = scanner.nextInt();
        System.out.print("Input three number: ");
        int numberThree = scanner.nextInt();
        System.out.println("The smallest number is " + findMinNumberFromThreeNumbers(numberOne, numberTwo, numberThree));
    }

    public static int findMinNumberFromThreeNumbers(int numberOne, int numberTwo, int numberThree) {
        return numberOne <= numberTwo & numberOne <= numberThree ? numberOne : numberTwo <= numberOne & numberTwo <= numberThree ? numberTwo : numberThree;
    }
}
