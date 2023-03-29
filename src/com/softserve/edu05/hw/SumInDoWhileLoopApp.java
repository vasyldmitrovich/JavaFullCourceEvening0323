package com.softserve.edu05.hw;

import java.util.Scanner;

public class SumInDoWhileLoopApp {

    public static void main(String[] args) {

        boolean continueFlag = true;
        do {
            Integer number1 = Integer.parseInt(getConsoleInput("Input 1st number:"));
            Integer number2 = Integer.parseInt(getConsoleInput("Input 2nd number:"));
            Integer sum = number1 + number2;
            System.out.println("Calculated sum is: " + sum);
            String answer = getConsoleInput("Do you want to continue? (yes/no)");
            if (answer.equals("no")) {
                continueFlag = false;
            }
        } while (continueFlag == true);

        System.out.println("Bye-bye!");
    }

    public static String getConsoleInput(String input) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(input);
        return scanner.nextLine();
    }
}
