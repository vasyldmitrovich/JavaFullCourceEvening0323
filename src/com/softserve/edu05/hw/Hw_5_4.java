package com.softserve.edu05.hw;

import java.util.Random;
import java.util.Scanner;

public class Hw_5_4 {
    public static void main(String[] args) {
        Random();

    }

    public static void Random() {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess_num;
        do {
            System.out.println("Try to guess number: ");
            guess_num = sc.nextInt();
            if (guess_num > num) {
                System.out.println("Your Number is higher, tyr again");
            } else if (guess_num < num) {
                System.out.println("Your Number is lower, tyr again");
            }
        } while (guess_num != num);
        System.out.println("You guessed the Number!");
    }


}
