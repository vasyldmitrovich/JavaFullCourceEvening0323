package com.softserve.apps;

import java.util.Scanner;

public class Task_4 {
    public static void Vowels() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String input = sc.nextLine();


        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'|| ch == 'Y') {
                count++;

            }
        }
        System.out.println("Result: "+count);


    }

    public static void main(String[] args) {
        Vowels();
    }
}