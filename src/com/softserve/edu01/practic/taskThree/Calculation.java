package com.softserve.edu01.practic.taskThree;

import java.util.Scanner;

public class Calculation {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        processWorkingWithCalculation();
    }

    public static void processWorkingWithCalculation() {
        System.out.println("Input first number");
        int numberOne = scanner.nextInt();
        System.out.println("Input two number");
        int numberTwo = scanner.nextInt();
        System.out.println("Choose please operation:\n1)a * b\n2)a + b\n3)a - b\n4)a / b");
        int chooseOperation = scanner.nextInt();
        System.out.println("result operation = " + new Calculation().chooseOperationAndStartOperation(numberOne, numberTwo, chooseOperation));
    }

    public int chooseOperationAndStartOperation(int numberOne, int numberTwo, int chooseOperation) {
        return switch (chooseOperation) {
            case 1 -> multiplicationNumbers(numberOne, numberTwo);
            case 2 -> plusNumber(numberOne, numberTwo);
            case 3 -> minusNumbers(numberOne, numberTwo);
            case 4 -> divisionNumbers(numberOne, numberTwo);
            default -> throw new RuntimeException("Error after choose operation!");
        };
    }

    public int multiplicationNumbers(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    public int divisionNumbers(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }

    public int minusNumbers(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    public int plusNumber(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
}
