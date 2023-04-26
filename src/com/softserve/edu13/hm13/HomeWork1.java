package com.softserve.edu13.hm13;

import java.util.Scanner;

public class HomeWork1 {
    public static String encrypt(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char shiftedChar = (char) (c + n);
                if (Character.isUpperCase(c)) {
                    if (shiftedChar > 'Z') {
                        shiftedChar = (char) ('A' + (shiftedChar - 'Z' - 1));
                    }
                } else {
                    if (shiftedChar > 'z') {
                        shiftedChar = (char) ('a' + (shiftedChar - 'z' - 1));
                    }
                }
                result.append(shiftedChar);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String decrypt(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char shiftedChar = (char) (c - n);
                if (Character.isUpperCase(c)) {
                    if (shiftedChar < 'A') {
                        shiftedChar = (char) ('Z' - ('A' - shiftedChar - 1));
                    }
                } else {
                    if (shiftedChar < 'a') {
                        shiftedChar = (char) ('z' - ('a' - shiftedChar - 1));
                    }
                }
                result.append(shiftedChar);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        System.out.println("Print encrypt line: " + encrypt(line, 4));
        System.out.println("Print encrypt line: " + decrypt(line, 4));
    }
}
