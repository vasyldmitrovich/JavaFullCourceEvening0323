package com.softserve.apps;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some text: ");
        String text = scanner.nextLine();

        int wordCount = countWords(text);

        System.out.printf("Word count: %d%n", wordCount);
    }

    //The method counts the number of words in the input string
    private static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
    public static void print(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some text: ");
        String text = scanner.nextLine();

        int wordCount = countWords(text);

        System.out.printf("Word count: %d%n", wordCount);
    }
}
