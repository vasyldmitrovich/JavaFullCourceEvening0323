package com.softserve.edu04.hw04;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введіть третє число: ");
        int num3 = scanner.nextInt();

        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);

        System.out.println("Максимальне значення: " + max);
        System.out.println("Мінімальне значення: " + min);
    }
}
