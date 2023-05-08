package com.softserve.edu11.hw;

import java.util.Scanner;

public class WordsApp {

    public static void main(String[] args) {
        String sentence = inputSentence();
        findLongestWordInSentence(sentence);
        displaySecondWordInReverseOrder(sentence);
    }

    public static String inputSentence() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input sentence of 5 words: ");
        return scanner.nextLine();
    }

    public static void findLongestWordInSentence(String sentence) {
        String[] words = sentence.split("\\W+");
        String longestWord = words[0];
        for (String word: words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("The longest word is: " + longestWord);
        System.out.println("Number of letters in this word is: " + longestWord.length());
    }

    public static void displaySecondWordInReverseOrder(String sentence) {
        String[] words = sentence.split("\\W+");
        StringBuilder sb = new StringBuilder(words[1]);
        System.out.println("The second word in reverse order: " + sb.reverse());
    }
}
