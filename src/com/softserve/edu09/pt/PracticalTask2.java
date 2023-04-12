package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.HashSet;

public class PracticalTask2 {
    public static void main(String[] args) {
        String num = "1, 2, 3, 4, 4, 5, 6, 6, 7, 8";
        String numbers[] = num.split(", ");

        HashSet<String> set = new HashSet<>();
        for (String numb : numbers) {
            set.add(numb);
        }

        for (String numb : set) {
            System.out.println(numb);
        }
    }
}
