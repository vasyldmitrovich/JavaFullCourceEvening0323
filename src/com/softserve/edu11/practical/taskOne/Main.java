package com.softserve.edu11.practical.taskOne;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task with square rectangle!");
        System.out.println("Input first number");
        int numberOne = 0, numberTwo = 0;
        if(scanner.hasNextInt()){
             numberOne = scanner.nextInt();
        }else throw new NotNumberException("You input not number!");
        System.out.println("Input second number");
        if(scanner.hasNextInt()){
            numberTwo = scanner.nextInt();
        }else throw new NotNumberException("You input not number!");
        if(numberOne >= 0 && numberTwo >= 0){
            System.out.println("Result = "+new Rectangle().squareRectangle(numberOne,numberTwo));
        }else throw new NegativeNumberException("We found negative number!");
    }
}
