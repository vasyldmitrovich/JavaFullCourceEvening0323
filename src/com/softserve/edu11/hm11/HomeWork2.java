package com.softserve.edu11.hm11;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence from console
        System.out.println("Enter a sentence with words separated by multiple spaces: ");
        String sentence = scanner.nextLine();

        // Replace consecutive spaces with a single space
        String cleanedSentence = sentence.replaceAll("\\s+", " ");

        // Print the cleaned sentence
        System.out.println("Cleaned sentence: " + cleanedSentence);

        scanner.close();
    }
}
