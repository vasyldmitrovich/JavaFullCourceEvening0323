package edu04.homework02;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerNumbers {
    public static void main(String[] args) {
        int[] arrays = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first integer");
        arrays[0] = scanner.nextInt();
        System.out.println("Input second integer");
        arrays[1] = scanner.nextInt();
        System.out.println("Input third integer");
        arrays[2] = scanner.nextInt();
        System.out.println("Max:");
        System.out.println(Arrays.stream(arrays).max());
        System.out.println("Min:");
        System.out.println(Arrays.stream(arrays).min());
    }
}
