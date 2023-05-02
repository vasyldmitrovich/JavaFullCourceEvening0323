package com.softserve.edu09.pt;

import java.util.*;

public class Pt_9_2 {
    public static void main(String[] args) {

        System.out.print("Enter your numbers(1 2 3 4...): ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[] numbers = Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        for (int number : numbers) {
            uniqueNumbers.add(number);
        }


        System.out.println("Without duplicates: " +uniqueNumbers);


    }
}
