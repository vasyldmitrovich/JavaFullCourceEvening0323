package com.softserve.edu01;

public class Task13 {
    public static int smallestPositiveNumber (){
        int number = 1;
        for (int i = 1; i < 20; i++) {
            if (number % i != 0) {
                i = 1;
                number++;
            }
        }
        return number;
    }
}
