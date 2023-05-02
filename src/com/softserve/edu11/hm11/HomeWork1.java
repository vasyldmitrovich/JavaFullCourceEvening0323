package com.softserve.edu11.hm11;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence from console
        System.out.println("Enter a five-word sentence: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Find the longest word
        String longestWord = "";
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        // Determine the number of letters in the longest word
        int numLetters = longestWord.length();

        // Print the longest word and its length
        System.out.println("Longest word: " + longestWord);
        System.out.println("Number of letters in the longest word: " + numLetters);

        // Print the second word in reverse order
        if (words.length >= 2) {
            String secondWord = words[1];
            String reversedSecondWord = reverseString(secondWord);
            System.out.println("Second word in reverse: " + reversedSecondWord);
        } else {
            System.out.println("The sentence does not have a second word.");
        }

        scanner.close();
    }

    // Helper method to reverse a string
    private static String reverseString(String s) {//Good
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
