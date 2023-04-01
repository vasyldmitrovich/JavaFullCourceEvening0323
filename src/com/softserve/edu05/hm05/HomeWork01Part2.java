package com.softserve.edu05.hm05;

import java.util.Scanner;

public class HomeWork01Part2 {
    public static void main(String[] args) {
        // Створюємо масив для зберігання 10 чисел
        int[] numbers = new int[10];
        int positiveSum = 0;
        int negativeProduct = 1;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.printf("Enter integer number #%d: ", i + 1);
            int a = input.nextInt();
            numbers[i] = a;
        }

//        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                positiveSum += numbers[i];
            } else {
                negativeProduct *= numbers[i+5];
            }
        }

        if (positiveSum > 0) {
            System.out.println("Сума перших п'яти додатніх чисел: " + positiveSum);
        } else {
            System.out.println("Добуток останніх п'яти від'ємних чисел: " + negativeProduct);
        }

    }
}