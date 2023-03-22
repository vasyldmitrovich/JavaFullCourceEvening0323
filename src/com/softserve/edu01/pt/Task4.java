package com.softserve.edu01.pt;

import java.util.Scanner;

import static java.lang.System.out;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("How are you?");
        String answer;
        answer = scanner.nextLine();
        out.println("You are " + answer + "!");
    }
}
