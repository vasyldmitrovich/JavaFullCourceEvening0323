package com.softserve.edu01.pt;

import java.util.Scanner;

public class ReversTheString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1, word2, word3;

        System.out.println("Input text:");

        word1 = scanner.nextLine();
        word2 = scanner.nextLine();
        word3 = scanner.nextLine();

        System.out.println("Output text:");
        System.out.println(word3);
        System.out.println(word2);
        System.out.println(word1);

    }
}

