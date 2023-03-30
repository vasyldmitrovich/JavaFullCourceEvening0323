package com.softserve.edu04.practic.taskOne;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] arrayString = {"Dog", "Police", "Government", "Ukraine", "Cat", "Hod-dog"};
        double[] doublesArray = {34.2, 12, 5.7, 2.1, 56, 24.2, 13, 15.9};
        WorkingWithArray workingWithArray = new WorkingWithArray();
        System.out.println("Sorted string array");
        System.out.println("Before sorted = " + Arrays.toString(arrayString));
        System.out.println("After sorted = " + Arrays.toString(workingWithArray.sortStringArray(arrayString)));
        System.out.println("Found average for numbers");
        System.out.println("average number = " + workingWithArray.foundAverageNumberFromArrayNumbers(doublesArray));
        System.out.println("Check on contain number or not");
        System.out.print("Input your string: ");
        String strFromUser = scanner.nextLine();
        System.out.println(workingWithArray.checkArrayOnContainString(arrayString,strFromUser));
    }
}
