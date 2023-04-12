package com.softserve.edu09.pt09.pt2;

import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter some numbers separated by commas");
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        String[] temp = nums.split(",");
        List<Integer> integerList = new ArrayList<>();
        for (String array : temp
        ) {
            integerList.add(Integer.parseInt(array));
        }
        System.out.println(integerList);
        Set<Integer> integerSet = new HashSet<>(integerList);
        integerList.clear();
        integerList.addAll(integerSet);
        integerSet.clear();
        System.out.println();
        System.out.println("Remove of duplicate elements");
        System.out.println(integerList);
    }
}

