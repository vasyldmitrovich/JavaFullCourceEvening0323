package com.softserve.edu11.hw;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        String sentence = "I  am  learning   Java   Fundamental";
        System.out.println(sentence);
        String sentenceWithOneSpace = sentence.replaceAll("\\s+", " ");
        System.out.println(sentenceWithOneSpace);
    }
}
