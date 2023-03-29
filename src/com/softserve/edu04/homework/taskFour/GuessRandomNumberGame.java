package com.softserve.edu04.homework.taskFour;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumberGame {
    private int guessNumber;
    private Scanner scanner = new Scanner(System.in);

    public GuessRandomNumberGame() {
        Random random = new Random();
        guessNumber = random.nextInt(0, 15);
    }

    public void startGame() {
        System.out.println("You need guess number!");
        while (true) {
            System.out.print("Input please number from 0 to 15: ");
            int numberFromUser = scanner.nextInt();
            if (numberFromUser == guessNumber) {
                System.out.println("You win!");
                break;
            }
            System.out.println(checkNumberForGame(numberFromUser));
        }
    }

    private String checkNumberForGame(int numberFromUser) {
        return numberFromUser > guessNumber ? "Too high, try again" : "Too low, try again";
    }
}
