package com.softserve.edu11.hw;

import java.util.Scanner;

public class ConsecutiveSpacesRemoverApp {

    public static void main(String[] args) {
        removeExtraSpaces();
    }

    public static void removeExtraSpaces() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input sentence (with extra spaces): ");
        String input = scanner.nextLine();
        String result = input.trim().replaceAll("\\s+", " ");
        System.out.println("After spaces removed: " + result);
    }
}
