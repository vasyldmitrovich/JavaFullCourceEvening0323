package com.softserve.edu10.homework.taskTwo;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task with replace space");
        System.out.println("Input your sentence");
        String sentence = scanner.nextLine();
        System.out.println("Before: "+sentence);
        sentence = sentence.replaceAll("\\s+"," ");
        System.out.println("After: "+sentence);
    }
}
