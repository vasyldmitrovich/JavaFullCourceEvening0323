package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PracticalTask2 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        System.out.println(primes);

        int count = primes.size();
        int min = primes.stream().mapToInt(Integer::intValue).min().orElse(0);
        int max = primes.stream().mapToInt(Integer::intValue).max().orElse(0);
        int sum = primes.stream().mapToInt(Integer::intValue).sum();

        System.out.println(count);
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
    }
}
