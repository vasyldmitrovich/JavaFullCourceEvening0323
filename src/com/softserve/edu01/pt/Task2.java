package com.softserve.edu01.pt;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 3 numbers:");
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        //Please add in print info what this number is, not only number, because if this code will run some person he does not know what that means
        System.out.println("Arithmetic average: " + (double) ((x + y + z))/ 3);

    }
}
