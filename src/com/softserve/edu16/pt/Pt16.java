package com.softserve.edu16.pt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pt16 {
    public static void main(String[] args) throws IOException {
        int countCharacters = 0;
        String testWord;
        String character = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input word");
        testWord = br.readLine();
        System.out.println("Input character");
        character = br.readLine();
        for (int i = 0; i < testWord.length(); i++) {
            String currentCharacter = testWord.substring(i, i+1);
            if (currentCharacter.equals(character)) {
                countCharacters++;
            }
        }
        System.out.println("The character " + character + " appears " + countCharacters + " times in the word " + testWord);
    }


}
