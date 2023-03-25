package com.softserve.edu03.hw;

import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {
        Integer number1 = getNumber("Input the first number: ");
        Integer number2 = getNumber("Input the second number: ");
        Integer number3 = getNumber("Input the third number: ");
        System.out.println("The smallest number is: " + Math.min(Math.min(number1, number2), number3));
    }

    public static Integer getNumber(String input) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(input);
        return Integer.parseInt(scanner.nextLine());
    }
}
