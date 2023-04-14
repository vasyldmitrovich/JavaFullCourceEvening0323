package com.softserve.edu05.hw;

import java.util.Scanner;
import java.util.Random;
public class FourthTaskGuessANumber {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(101);
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);

        while (true){
            int guessNumber = sc.nextInt();
            if(guessNumber > randomNumber){
                System.out.println("Too high, try again.");
            } else if(guessNumber < randomNumber) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("YES! The number is " + randomNumber);
                break;
            }

        }
    }
}
