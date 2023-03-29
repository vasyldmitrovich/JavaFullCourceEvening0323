package edu05.hw05.hw1;

public class ArrayOfTen {
    public static int sumOfFirstFive(int array[]) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (array[i] < 0) {
                break;
            }
            sum = sum + array[i];
            count++;
        }
        if (count < 5) {
            return 0;
        }
        return sum;
    }

    public static int productLastFive(int array[]) {
        int product = 1;
        for (int i = 5; i < 10; i++) {
            if (array[i] < 0) {
                continue;
            }
            product = product * array[i];
        }
        return product;
    }
}

