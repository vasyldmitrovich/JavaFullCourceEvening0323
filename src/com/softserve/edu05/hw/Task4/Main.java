package com.softserve.edu05.hw.Task4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randNum = random.nextInt(101);
        System.out.println("Enter number");
        int num = 0;
        while (num != randNum) {
            num = scanner.nextInt();
            if (num > randNum) {
                System.out.println("Too high, try again");
            } else if (num < randNum) {
                System.out.println("Too low, try again");
            } else {
                System.out.println("Congratulation");
                System.out.println("My number was " + randNum);
            }
        }
    }
}
