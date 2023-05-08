package com.softserve.edu01;

import java.util.Random;

public class Task9 {
    public static int countOnes(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (getRandomValue() == 1) {
                count++;
            }
        }
        return count;
    }

    public static int getRandomValue() {
        Random random = new Random();
        return random.nextInt(2);
    }
}
