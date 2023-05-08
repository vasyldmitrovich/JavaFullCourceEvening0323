package com.softserve.edu11.hw;

import java.util.*;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок з п'яти слів: ");
        String sentence = scanner.nextLine();

        String words[] = sentence.split(" ");
        String longestWord = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        System.out.println("Найдовше слово у реченні - " + longestWord.toUpperCase());
        System.out.println("Це слово має " + longestWord.length() + " букв.");

        if (words.length >= 2) {
            String secondWord = words[1];
            String reverse = new StringBuilder(secondWord).reverse().toString();
            System.out.println("Друге слово у зворотньому порядку - " + reverse);
        }
    }
}
