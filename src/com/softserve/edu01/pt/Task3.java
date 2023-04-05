package com.softserve.edu01.pt;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();

        out.println("Input a and b values");

        int size = 2;
        for (int i = 0; i < size; i++) {
            boolean add = arr.add(scanner.nextLine());
        }

        out.println("""
                Choose what you want
                1 - "+"
                2 - "-"
                3 - "*"
                4 - "/"
                5 - Finish""");

        //Variable I suggest should have name check, not chek
        int cheсk;
        boolean x = true;
        while (x) {

            cheсk = Integer.parseInt(scanner.nextLine());
            switch (cheсk) {
                case 1 -> {
                    int sum = Integer.parseInt(arr.get(0)) + Integer.parseInt(arr.get(1));
                    out.println("a + b = " + sum);
                    out.println("Once again?");
                }
                case 2 -> {
                    int minus = Integer.parseInt(arr.get(0)) - Integer.parseInt(arr.get(1));
                    out.println("a - b = " + minus);
                    out.println("Once again?");
                }
                case 3 -> {
                    int ply = Integer.parseInt(arr.get(0)) * Integer.parseInt(arr.get(1));
                    out.println("a * b = " + ply);
                    out.println("Once again?");
                }
                case 4 -> {
                    double dil = Double.parseDouble(arr.get(0)) / Double.parseDouble(arr.get(1));
                    out.println("a / b = " + dil);
                    out.println("Once again?");
                }
                case 5 -> x = false;
                //Do not have massage if user entered incorrect number
                default -> {
                    out.println("You entered incorrect value!");
                }
            }
        }

    }
}
