package com.softserve.edu04.hw;

import java.util.Scanner;

public class Hw04 {
    public static void main(String[] args) {
        hw1();
        hw2();
        //hw3();
        //hw4();
        //hw5();
        System.out.print("Input county(Ukraine/Canada/Chilie): ");
        Scanner sc = new Scanner(System.in);
        Country c = Country.valueOf(sc.nextLine().toUpperCase());
        System.out.print(c.getCountryContinent());
    }

    private static void hw2() {
        Scanner inInt = new Scanner(System.in);
        System.out.println("Please input 3 integer numbers: ");
        int a = inInt.nextInt();
        int b = inInt.nextInt();
        int c = inInt.nextInt();
        int min = a, max = a;

        if (b < min) {
            if (b < c) {
                min = b;
            } else {
                min = c;
            }
        }
        if (b > max) {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        System.out.println("Max: " + max + "\r\n" + "Min: " + min);
    }

    private static void hw1() {
        Scanner inFloat = new Scanner(System.in);
        System.out.println("Please input 3 float numbers: ");
        float a = inFloat.nextFloat();
        float b = inFloat.nextFloat();
        float c = inFloat.nextFloat();
        if (a > -5.0f && a < 5.0f && b > -5.0f && b < 5.0f && c > -5.0f && c < 5.0f) {
            System.out.print("All values are in range -5..5");
        } else {
            System.out.println("Some values are out of the range -5..5");
        }
    }

    public enum Country {
        UKRAINE("Eurasia"),
        CANADA("North America"),
        CHILIE("South America");
        private String continent;

        private Country(String continent) {
            this.continent = continent;
        }

        public String getCountryContinent() {
            return continent;
        }

    }
}
