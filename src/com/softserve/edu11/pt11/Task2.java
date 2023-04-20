package com.softserve.edu11.pt11;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input last name, first name and middle name");
        String fullName = sc.nextLine();
        lastWithInitials(fullName);
        System.out.println();
        firstName(fullName);
        System.out.println();
        fullName(fullName);
    }

    private static void lastWithInitials(String s1) {
        String[] arr = s1.split(" ");
        char ch1 = arr[1].charAt(0);
        char ch2 = arr[2].charAt(0);
        System.out.println(arr[0] + " " + ch1 + ". " + ch2 + ".");
    }

    private static void firstName(String s1) {
        String[] arr = s1.split(" ");
        System.out.println("First name is " + arr[1]);
    }

    private static void fullName(String s1) {
        String[] arr = s1.split(" ");
        System.out.println("First name: " + arr[1] + " middle name: " + arr[2] + " last name: " + arr[0]);
    }
}

