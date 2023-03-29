package edu03.pt03.pt1;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        int first = getNumbers("Input number");
        int second = getNumbers("Input number");
        System.out.println("Sum of this numbers");
        System.out.println(getTotal(first, second));
        System.out.println("Average of this numbers");
        System.out.println(getAverage(first, second));
    }
    private static int getNumbers(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    private static int getTotal(int first, int second) {
        return first + second;
    }
    private static double getAverage(int first, int second) {
        return (first + second) * 0.5;
    }
}
