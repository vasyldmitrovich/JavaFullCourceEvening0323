package com.softserve.edu14.pt14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PracticalTask1 {
    public static void main(String[] args) {//Glad to see main yours main method, perfect
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");

        // Task 1. Print how many empty strings are in this list
        long countEmptyStrings = list.stream().filter(String::isEmpty).count();
        System.out.println("Number of empty strings in the list: " + countEmptyStrings);

        // Task 2. Remove all empty Strings from list and print the result
        List<String> listWithoutEmptyStrings = list.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println("List without empty strings: " + listWithoutEmptyStrings);

        // Task 3. Convert String to uppercase and Join them with coma. Print the result
        String joinedUppercaseStrings = list.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println("Joined uppercase strings: " + joinedUppercaseStrings);
    }
}
