package com.softserve.edu05.hm05;

import java.util.Scanner;

public class HomeWork01Part3 {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        /*
        Receive 5 integers from the user and store them in an array.
        UA. - Отримуємо 5 цілих чисел від користувача та зберігаємо їх у масиві
         */
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an integer" + (i+1) + ": ");
            int number = scanner.nextInt();
            numbers[i] = number;
        }


        /*
        task01
        Print the position of the second positive integer, if any.
        UA. - Виводимо позицію другого додатнього числа, якщо воно наявне.
         */
        int positionNum = positionNumber(numbers);
        if (positionNum >= 0) {
            System.out.println("Позиція другого додатнього числа: " + positionNum);
        } else {
            System.out.println("У масиві немає другого додатнього числа");
        }


        /*
        task02
        Print the minimum value in the array.
        UA. - Виводимо мінімальне значення в масиві
         */
        int minValue = getMinValue(numbers);
        System.out.printf("The minimum value in the array: %d\n", minValue );


        /*
        Print the position of the minimum value in the array.
        UA. - Виводимо позицію мінімального значення в масиві
         */
        int minIndex = getMinIndex(numbers);
        System.out.printf("Index of the minimum value in the array : %d\n", minIndex);


        /*
        Calculate the product of all entered even numbers, excluding 0 if it was entered by the user.
        UA. - Обчислюємо добуток усіх введених парних чисел, виключаючи 0, якщо його ввів користувач.
         */
        int product = multiplyArrayElements(numbers);
        System.out.printf("The product of all even numbers(excluding 0): %d\n", product);
    } //close main function


    /*
    Find the position of the second positive number in the array.
    UA. - Знаходимо позицію другого додатнього числа в масиві.
     */
    public static int positionNumber(int[] numbers){
        int positiveCount = 0;
        /*
        If there is no second positive number, the position will be -1.
        UA. - Якщо другого додатнього числа немає, позиція буде -1
         */
        int position = -1;

        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
                if (positiveCount == 2) {
                    position = i;
                    break;
                }
            }
        }
    return positiveCount;
    }


    /*
    We are looking for the minimum value in the array.
    UA. - Шукаємо мінімальне значення в масиві.
     */
    public static int getMinValue(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    /*
    Return the position of the minimum value.
    UA. - Повертаємо позицію мінімального значення.
     */
    public static int getMinIndex(int[] numbers) {
        int min = numbers[0];
        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


    /*
    Calculate the product of all entered even numbers (excluding 0 from even numbers if entered by the user).
    UA. - Обчислюємо добуток усіх введених парних чисел (виключаючи 0 з парних чисел, якщо його ввів користувач).
     */
    public static int multiplyArrayElements(int[] numbers) {
        int result = 1;
        for (int number : numbers) {
            if (number != 0) {
                result *= number;
            }
        }
        return result;
    }

}
