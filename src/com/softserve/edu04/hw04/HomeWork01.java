package com.softserve.edu04.hw04;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення 3 чисел з консолі
        System.out.println("Введіть перше число: ");
        int num1 = scanner.nextInt();

        System.out.println("Введіть друге число: ");
        int num2 = scanner.nextInt();

        System.out.println("Введіть третє число: ");
        int num3 = scanner.nextInt();

        scanner.close();

        /*All this logic move to some method for example public static void isInRange( int a, int b, int c)
        * and in main method write isInRange( num1, num2, num3)*/
        if (num1 >= -5 && num1 <= 5) {
            System.out.println(num1 + " входить в діапазон [-5, 5]");
        } else {
            System.out.println(num1 + " не входить в діапазон [-5, 5]");
        }

        if (num2 >= -5 && num2 <= 5) {
            System.out.println(num2 + " входить в діапазон [-5, 5]");
        } else {
            System.out.println(num2 + " не входить в діапазон [-5, 5]");
        }

        if (num3 >= -5 && num3 <= 5) {
            System.out.println(num3 + " входить в діапазон [-5, 5]");
        } else {
            System.out.println(num3 + " не входить в діапазон [-5, 5]");
        }
    }
}
