package com.softserve.edu09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AppP_9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers in this format 1,4,5,6... ");
        String numbers = sc.nextLine();
        Set<String> set = new HashSet<>(Arrays.asList(numbers.split(",")));

        System.out.println("Unique elements:");
        for (String element : set) {
            System.out.print(element);
        }
    }
}
