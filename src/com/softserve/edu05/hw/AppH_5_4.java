package com.softserve.edu05.hw;

import java.util.Random;
import java.util.Scanner;

public class AppH_5_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randNum = rand.nextInt(100) + 1;
        int yourNum;
        do {
            System.out.print("Guess a number between 1 and 100: ");
            yourNum = input.nextInt();
            if (yourNum > randNum) {
                System.out.println("Too high, try again.");
            } else if (yourNum < randNum) {
                System.out.println("Too low, try again.");
            }
        } while (yourNum != randNum);
        System.out.println("You guessed the number!!! ");
    }
}
