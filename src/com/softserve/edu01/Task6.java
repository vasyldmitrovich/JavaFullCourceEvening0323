package com.softserve.edu01;

public class Task6 {
    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
}
