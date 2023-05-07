package com.softserve.edu16.pt16;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        String fileName = "text";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            String lastWord = null;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.matches("(?i)[aeiou].*")) {
                        System.out.println(word);
                    }
                    if (lastWord != null && lastWord.charAt(lastWord.length() - 1) == word.charAt(0)) {
                        System.out.println("Words that starting and ending with the same letters: "+lastWord + " " + word);
                    }
                    lastWord = word;
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
