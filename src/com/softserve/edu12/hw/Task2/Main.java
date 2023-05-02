package com.softserve.edu12.hw.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++){
            readNumber(1,10,scanner.nextInt());//Add try catch there
        }
    }

    private static int readNumber(int start, int end, int number) {
        if (start <= number && end >= number){
            System.out.println("Number in range");
            return number;
        } else {
            throw new RuntimeException("Number not in range");
        }
    }
}
