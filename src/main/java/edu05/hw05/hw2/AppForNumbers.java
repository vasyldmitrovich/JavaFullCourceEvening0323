package edu05.hw05.hw2;

import java.util.Scanner;

public class AppForNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(sumOfNumbers(sc));
        }
        while (showAnswer());
    }

    public static int sumOfNumbers(Scanner sc) {
        System.out.println("Enter first integer");
        int first = sc.nextInt();
        System.out.println("Enter second integer");
        int second = sc.nextInt();
        return first + second;
    }

    public static boolean showAnswer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to continue? yes/no");
        String answer = sc.nextLine();
        if (answer.equals("yes")) {
            return true;
        } else return false;
    }

}
