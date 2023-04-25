package com.softserve.edu13.hw13;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string");
        String str = sc.nextLine();
        System.out.println("Input number of letters need's to plus");
        int f1 = sc.nextInt();
        System.out.println("Input number of letters need's to return back");
        int f2 = sc.nextInt();
        System.out.println(encrypt(str, f1));
        System.out.println(decrypt(str, f2));
    }

    private static String encrypt(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                char newChar = (char) (c + n);
                if (Character.isUpperCase(c) && newChar > 'Z') {
                    newChar = (char) (newChar - 26);
                } else if (Character.isLowerCase(c) && newChar > 'z') {
                    newChar = (char) (newChar - 26);
                }
                sb.append(newChar);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static String decrypt(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                char newChar = (char) (c - n);
                if (Character.isUpperCase(c) && newChar < 'A') {
                    newChar = (char) (newChar + 26);
                } else if (Character.isLowerCase(c) && newChar < 'a') {
                    newChar = (char) (newChar + 26);
                }
                sb.append(newChar);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
