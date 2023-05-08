package com.softserve.edu01;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static List<Integer> generateFibonacci(int num) {
        List<Integer> fib = new ArrayList<>();
        if (num >= 1) {
            fib.add(1);
        }
        if (num >= 2) {
            fib.add(1);
        }
        for (int i = 2; i < num; i++) {
            int sum = fib.get(i - 1) + fib.get(i - 2);
            fib.add(sum);
        }
        return fib;
    }
}
