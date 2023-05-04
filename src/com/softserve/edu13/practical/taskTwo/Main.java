package com.softserve.edu13.practical.taskTwo;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2,3,5,7,11,13,17,19,23,29);
        System.out.println("I have collection with elements: \n"+primes);
        long count = primes.stream().count();
        int min = primes.stream().min(Integer::compareTo).get();
        int max = primes.stream().max(Integer::compareTo).get();
        int sum = primes.stream().reduce(((integer, integer2) -> integer+integer2)).get();
        System.out.println("Collection have: \n"+"count element = "+count+"\nmin = "+min+"\nmax = "+max+"\nsum = "+sum);
    }
}
