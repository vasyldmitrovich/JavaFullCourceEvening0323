package com.softserve.edu05.hm;

import java.util.Scanner;

public class GameRandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 10000;

        int randomNumber = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Try to guess the number from 0 to 10000");

        int opinion = -1;
        int attempt = 0;

        while (opinion != randomNumber) {
            opinion = scanner.nextInt();
            attempt++;
            if (opinion > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (opinion < randomNumber) {
                System.out.println("Too low, try again");
            }
        }
        System.out.println("you won in " + attempt + " attempts!");
    }
}
