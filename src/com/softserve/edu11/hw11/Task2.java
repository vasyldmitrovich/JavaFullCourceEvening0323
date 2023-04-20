package com.softserve.edu11.hw11;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a sentence that contains words separated by more than one space");
        String sentence = sc.nextLine();
        String newSentence = sentence.replaceAll("\\s+"," ");
        System.out.println(newSentence);
    }
}

