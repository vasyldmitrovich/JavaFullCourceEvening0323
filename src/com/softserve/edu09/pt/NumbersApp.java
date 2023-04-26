package com.softserve.edu09.pt;

import java.util.*;

public class NumbersApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a set of numbers");
        String input = scanner.nextLine();

        Set<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                result.append(c);
            }
        }
        System.out.println("Result: " + result.toString());
    }
}
