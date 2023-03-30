package com.softserve.edu01.practic.taskTwo;

import java.util.Scanner;

public class WorkingWithNumber {
    private Scanner scanner = new Scanner(System.in);

    public void processWorkingWithNumbers() {
        System.out.println("Input first number:");
        double numberOneFromConsole = scanner.nextDouble();
        System.out.println("Input second number:");
        double numberTwoFromConsole = scanner.nextDouble();
        System.out.println("Input three number:");
        double numberThreeFromConsole = scanner.nextDouble();
        System.out.println("Average is " + foundAverageFromThreeNumbers(numberOneFromConsole, numberTwoFromConsole, numberThreeFromConsole));
    }

    public double foundAverageFromThreeNumbers(double numberOne, double numberTwo, double numberThree) {
        return (numberOne + numberTwo + numberThree) / 3;
    }
}
