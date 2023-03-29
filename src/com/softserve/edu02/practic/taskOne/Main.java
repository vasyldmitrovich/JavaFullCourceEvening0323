package com.softserve.edu02.practic.taskOne;

public class Main {
    public static void main(String[] args) {
        WorkWithNumbers workWithNumbers = new WorkWithNumbers();
        double numberOne = WorkWithNumbers.getNumber("Enter the first number: ");
        double numberTwo = WorkWithNumbers.getNumber("Enter the second number: ");
        System.out.println("The sum of " + numberOne + " and " + numberTwo + " is " + workWithNumbers.getTotal(numberOne, numberTwo));
        System.out.println("The average of " + numberOne + " and " + numberTwo + " is " + workWithNumbers.getAverage(numberOne, numberTwo));
    }
}
