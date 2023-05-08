package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class PracticalTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> myCollection = new ArrayList<>();
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            myCollection.add(scan.nextInt());
        }
        System.out.println(myCollection);

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println("Positions of elements greater than 5: " + newCollection);

        myCollection.removeIf(n -> n > 20);
        System.out.println("Array after removing elements greater than 20: " + myCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position: " + i + ". Value: " + myCollection.get(i));
        }

        myCollection.sort(Integer::compareTo);
        System.out.println("Sorted array: " + myCollection);
    }
}
