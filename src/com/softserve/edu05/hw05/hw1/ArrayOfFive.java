package com.softserve.edu05.hw05.hw1;


public class ArrayOfFive {
    public static int positionOfSecondPosNumber(int array[]) {
        int calc = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                calc++;
                if (calc == 2) {
                    return i + 1;
                }
            }
        }
        return 0;
    }

    public static int minValue(int array[]) {
        int minValue = array[0];
        int positionOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                positionOfMin = i;
            }
        }
        System.out.println("Minimum value " + minValue);
        System.out.println("Its posotion " + (positionOfMin + 1));
    return minValue;}

    public static int productOfEven(int array[]) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                product = product * array[i];
            }
        }
        System.out.print("Product of even numbers "+product);
    return product;}
}
