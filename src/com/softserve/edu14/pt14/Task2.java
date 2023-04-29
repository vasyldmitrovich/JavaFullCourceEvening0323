package com.softserve.edu14.pt14;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 4, 7, 11, 13, 17, 19, 23, 29);
        statistic(primes);

    }

    private static void statistic(List<Integer> primes) {
        IntSummaryStatistics stats = primes.stream()
                .mapToInt((x) -> x).summaryStatistics();
        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
    }
}


