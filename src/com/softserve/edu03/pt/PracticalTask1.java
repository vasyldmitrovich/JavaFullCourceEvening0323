package com.softserve.edu03.pt;

import java.util.Scanner;

public class PracticalTask1 {

    public static void main(String[] args) {
        Integer number1 = getNumber("Enter the first number: ");
        Integer number2 = getNumber("Enter the second number: ");
        System.out.println(String.format("The sum of %s and %s is %s", number1, number2, getTotal(number1, number2)));
        System.out.println(String.format("The average of %s and %s is %s", number1, number2, getAverage(number1, number2)));
    }

    public static Integer getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return Integer.valueOf(scanner.nextLine());
    }

    public static Integer getTotal(Integer number1, Integer number2) {
        return number1 + number2;
    }

    public static Double getAverage(Integer number1, Integer number2) {
        return Double.valueOf(getTotal(number1, number2))/2;
    }
}
