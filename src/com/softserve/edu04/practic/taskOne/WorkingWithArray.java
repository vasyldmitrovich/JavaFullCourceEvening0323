package com.softserve.edu04.practic.taskOne;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class WorkingWithArray {
    private Scanner scanner = new Scanner(System.in);

    public String[] sortStringArray(String[] arrayString) {
        return Arrays.stream(arrayString).sorted(Comparator.comparing(String::length)).toArray(String[]::new);
    }

    public double foundAverageNumberFromArrayNumbers(double[] doubleArray) {
        return Arrays.stream(doubleArray).average().orElse(0);
    }

    public void checkArrayOnContainString(String[] arrayString) {
        System.out.print("Input your string: ");
        String strFromUser = scanner.nextLine();
        System.out.println(processCheckArrayString(arrayString, strFromUser) == true ? "value = " + strFromUser + " contains in array!" : "value = " + strFromUser + " not contains in array!");
    }

    private boolean processCheckArrayString(String[] arrayString, String strFromUser) {
        return Arrays.stream(arrayString).anyMatch(str -> str.equals(strFromUser) == true);
    }
}
