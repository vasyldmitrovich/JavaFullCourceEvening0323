package com.softserve.edu05.hw;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        int num;
        int randomNum;
        Random random = new Random();
        randomNum = random.nextInt(10);
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Enter you number: ");
            num = scan.nextInt();

            if (num > randomNum) {
                System.out.println("Too high, try again.");
            }
            if (num < randomNum) {
                System.out.println("Too low, try again.");
            }
            if (num == randomNum) {
                System.out.println("Yes, you guessed it!");
            }
        } while (num != randomNum);
        scan.close();
    }
}
