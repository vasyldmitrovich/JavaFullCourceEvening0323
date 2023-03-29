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
        foundAverageFromThreeNumbers(numberOneFromConsole, numberTwoFromConsole, numberThreeFromConsole);
    }

    private void foundAverageFromThreeNumbers(double numberOne, double numberTwo, double numberThree) {
        System.out.println("Average is " + ((numberOne + numberTwo + numberThree) / 3));
    }
}
