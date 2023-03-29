package com.softserve.edu04.hw;

import java.util.Scanner;

public class NumbersInRangeApp {

    public static void main(String[] args) {
        Float number1 = getNumber("Input first number: ");
        Float number2 = getNumber("Input second number: ");
        Float number3 = getNumber("Input third number: ");

        if (number1 >= -5 && number1 <= 5
                && number2 >= -5 && number2 <= 5
                && number3 >= -5 && number3 <= 5) {
            System.out.println("All numbers are belong to the range [-5, 5]");
        } else {
            System.out.println("Some numbers are not in range [-5, 5]");
        }
    }

    /*It is good use method for read data from user*/
    public static Float getNumber(String input) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(input);
        return Float.parseFloat(scanner.nextLine());
    }
}
