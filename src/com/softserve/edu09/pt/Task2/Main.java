package com.softserve.edu09.pt.Task2;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String setOfNumbers = "1,2,3,4,5,6,7,8,8,8,8,9,0";
        String[] splitNumbers = setOfNumbers.split("[,\\s]+");

        Set<String> uniqueNumbers = new HashSet<>(Arrays.asList(splitNumbers));

        for (String numbers : uniqueNumbers){
            System.out.print(numbers + ", ");
        }

    }
}
