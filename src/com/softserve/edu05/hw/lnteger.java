package com.softserve.edu05.hw;


import java.util.Scanner;

public class lnteger {
    public static void main(String[] args) {
        operation();
    }

    public static void operation() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int position = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an integer: ");
            numbers[i] = scanner.nextInt();

        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                position++;
            }
            if (position == 2) {
                System.out.println("Position of second positive is --> " + i);
            }
        }
        int min = numbers[0];
        position  =0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                position = i;
            }
        }
        System.out.println("Min element is --> " + min);
        System.out.println("Position of min element is --> " + position);
        int product = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                product *= numbers[i];
            }
        }
        System.out.println("Product of all even numbers is --> " + product);
    }
}