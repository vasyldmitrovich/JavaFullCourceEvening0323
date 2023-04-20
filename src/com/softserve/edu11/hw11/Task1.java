package com.softserve.edu11.hw11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input sentence of five words");
        String sentence = sc.nextLine();
        longestWord(sentence);
        System.out.println();
        wordInReverse(sentence);
    }

    private static void longestWord(String st) {
        String[] arr = st.split(" ");
        String longest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (longest.length() < arr[i].length()) {
                longest = arr[i];
            }
        }
        System.out.println("The longest word is " + longest);
        System.out.print("The length is "+longest.length());
    }

    private static void wordInReverse (String st){
        String[] arr = st.split(" ");
        StringBuilder temp = new StringBuilder(arr[1]);
        System.out.println("Second word in reverse order "+temp.reverse());
    }
}
