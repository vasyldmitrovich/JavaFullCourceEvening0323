package com.softserve.edu11.homework.taskOne;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task with div two numbers");
        System.out.println("Input first number:");
        double numberOne = scanner.nextDouble();
        System.out.println("Input second number:");
        double numberTwo = scanner.nextDouble();
        try{
            System.out.println("Result div = "+divTwoDoubleNumbers(numberOne,numberTwo));
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception!");
        }
    }

    public static double divTwoDoubleNumbers(double numberOne, double numberTwo) throws ArithmeticException  {
        if(numberTwo == 0 || (numberOne == 0 && numberTwo == 0)) throw new ArithmeticException();
        return numberOne / numberTwo;
    }
}
