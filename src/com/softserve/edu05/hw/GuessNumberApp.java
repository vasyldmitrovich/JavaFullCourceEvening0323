package com.softserve.edu05.hw;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberApp {
    public static void main(String[] args) {
        Integer number = generateNumber();

        Integer guessNumber;
        do {
            guessNumber = getNumber();
            if (guessNumber > number) {
                printMessage("Too high, try again.");
            } else if (guessNumber < number) {
                printMessage("Too low, try again.");
            } else if (guessNumber == number) {
                printMessage("Congrats! You guess the number!");
            }
        } while (guessNumber != number);

    }

    public static Integer getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess what the number is: ");
        return scanner.nextInt();
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static Integer generateNumber() {
        Integer min = 0;
        Integer max = 10;
        Random r = new Random();
        System.out.println("Generating random number in range [0, 10] ...");
        return r.nextInt((max - min) + 1) + min;
    }
}
