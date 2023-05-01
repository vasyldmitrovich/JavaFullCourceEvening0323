package com.softserve.edu14.pt14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PracticalTask2 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        //calculate count, min, max, sum, for numbers and print all results
        int count = primes.size();
        int min = Collections.min(primes);
        int max = Collections.max(primes);
        int sum = primes.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Count: " + count);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);
    }
}
