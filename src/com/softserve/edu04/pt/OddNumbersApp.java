package com.softserve.edu04.pt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddNumbersApp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer[] numbers = new Integer[3];
        for (int i = 0; i < 3; i++) {
            System.out.println(String.format("Input %s number: ", i+1));
            numbers[i] = Integer.parseInt(br.readLine());
        }

        int countOdd = 0;
        Integer[] oddNumbers = new Integer[3];
        for (int i = 0; i < 3; i++) {
            if (numbers[i] % 2 != 0) {
                oddNumbers[countOdd] = numbers[i];
                countOdd ++;
            }
        }

        if (countOdd > 0) {
            System.out.println("Total odd numbers: " + countOdd);
            for (int i = 0; i < countOdd; i++) {
                System.out.println("Odd number is: " + oddNumbers[i]);
            }
        } else {
            System.out.println("There is no odd numbers!");
        }
    }
}
