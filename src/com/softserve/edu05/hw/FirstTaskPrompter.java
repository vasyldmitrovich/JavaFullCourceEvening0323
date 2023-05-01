package com.softserve.edu05.hw;

import java.util.Scanner;

public class FirstTaskPrompter {
    public static void main(String[] args) {
        //All there is good ;-)
        int amountOfDays = DaysInMonth.getAmountOfDays(getNumber("Input number of the month: "));
        System.out.println(amountOfDays);

        TenDigitsArray tenDigitsArray = new TenDigitsArray(fillNumbersArray(10));
        System.out.println("\t" + tenDigitsArray.calculate());

        FiveDigitsArray fiveDigitsArray = new FiveDigitsArray(fillNumbersArray(5));
        System.out.println("\t1) Position (index) of second positive number is " + fiveDigitsArray.getPositionOfSecondPositive());
        System.out.println("\t2) Minimum value in the array is: " + fiveDigitsArray.getMinimumValue());
        System.out.println("\t3) Product of even numbers equals: " + fiveDigitsArray.getProductOfEven());
    }

    static int[] fillNumbersArray(int size){
        System.out.println("Fill the array with " + size + " numbers: ");
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[size];
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Element #" + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    static int getNumber(String message){
        System.out.print(message);
        return new Scanner(System.in).nextInt();
    }
}
