package com.softserve.edu05.hw;

import java.util.Scanner;

public class AppH_5_2 {
    public static void main(String[] args){
        numersSum();
    }
    public static void numersSum() {
        Scanner input = new Scanner(System.in);
        int x, y, sum;
        char doAgain;
        do {
            System.out.print("Enter the first number --> ");
            x = input.nextInt();
            System.out.print("Enter the second number --> ");
            y = input.nextInt();

            sum = x + y;
            System.out.println("The sum is --> " + sum);

            System.out.print("Do you want to sum them again ? (Y/N): ");
            doAgain = input.next().charAt(0);
        } while (doAgain == 'Y' || doAgain == 'y');
    }
}
