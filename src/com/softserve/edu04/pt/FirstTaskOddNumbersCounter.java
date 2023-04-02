package com.softserve.edu04.pt;

import java.util.Scanner;
public class FirstTaskOddNumbersCounter {
    public static void main(String[] args) {
        int oddNumbers;
        Scanner sc = new Scanner(System.in);

        int num1 = getNumber("Input first number:",sc);
        int num2 = getNumber("Input second number:",sc);
        int num3 = getNumber("Input third number:",sc);

        oddNumbers = getAmountOfOdds(num1, num2, num3);
        String conj = "";

        switch (oddNumbers){
            case 1:
                conj = " is ";
                break;
            default:
                conj = " are ";
        }

        System.out.println("Among " + num1 + ", " + num2 + " and " + num3 + " there" + conj + ((oddNumbers == 0) ? "not" : oddNumbers) + " odd numbers");

    }

    static int getNumber(String message, Scanner sc){
        System.out.print(message + " ");
        return sc.nextInt();
    }
    static int getAmountOfOdds(int num1, int num2, int num3){
        int amountOfOdd = 0;

        if (num1 % 2 > 0){
            amountOfOdd++;
        }
        if (num2 % 2 > 0){
            amountOfOdd++;
        }
        if (num3 % 2 > 0){
            amountOfOdd++;
        }

        return amountOfOdd;
    }
}
