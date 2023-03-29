package com.softserve.edu05.hw05.hw4;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 20 - 10);
        System.out.println("Input your guess from -10 to 10");
        int guess = sc.nextInt();
        startGame(guess, randomNumber);
    }

    public static void startGame(int guess, int randomNumber) {
        Scanner sc = new Scanner(System.in);
        if ((guess > randomNumber)) {
            System.out.println("Too high");
            System.out.println("Try again");
            System.out.println("Input your guess from -10 to 10");
            int guessSecond = sc.nextInt();
            startGame(guessSecond, randomNumber);
        }
        if (guess < randomNumber) {
            System.out.println("Too low");
            System.out.println("Try again");
            System.out.println("Try again");
            System.out.println("Input your guess from -10 to 10");
            int guessNew = sc.nextInt();
            startGame(guessNew, randomNumber);
        } else System.out.println("You are right");

    }
}
