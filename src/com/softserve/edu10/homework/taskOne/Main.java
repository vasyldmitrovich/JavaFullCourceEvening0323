package com.softserve.edu10.homework.taskOne;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task with five worlds");
        System.out.println("Input please sentences with 5 world across space");
        String sentence = scanner.nextLine();
        String[] sentenceArray = sentence.split(" ");
        if(sentenceArray.length == 5){
            String maxLengthWorld = foundMaxLengthStr(sentenceArray);
            System.out.println("Max length world = "+maxLengthWorld);
            System.out.println("He had "+maxLengthWorld.length()+" chars");
            System.out.println(new StringBuilder(sentenceArray[1]).reverse());
        }else {
            System.out.println("You wrong input!");
        }
    }

    private static String foundMaxLengthStr(String[] arrayStr){
        return Arrays.stream(arrayStr).reduce((s1, s2) -> s1.length()>s2.length() ? s1 : s2).get();
    }
}
