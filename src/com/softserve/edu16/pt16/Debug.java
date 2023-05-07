package com.softserve.edu16.pt16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Debug {
    public static void main(String[] args) {
        int countCharacters = 0;
        String testWord;
        String inputCharacter;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input word");
        testWord = br.readLine();
        System.out.println("Input character");
        inputCharacter = br.readLine();

        for (int i = 0; i < testWord.length(); i++) {
            String character = testWord.substring(i, i + 1);
            if (character.equals(inputCharacter)) {
                countCharacters++;
            }
        }

        System.out.println("There are " + countCharacters + " occurrences of the character " + inputCharacter + " in the word " + testWord);}
}
