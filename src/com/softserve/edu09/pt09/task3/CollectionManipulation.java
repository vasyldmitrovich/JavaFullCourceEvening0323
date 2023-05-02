package com.softserve.edu09.pt09.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionManipulation {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Fill myCollection with 10 integers from console or randomly
        System.out.println("Enter 10 integers for myCollection:");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            myCollection.add(num);
        }

        // Find and save positions of elements greater than 5 in newCollection
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            int num = myCollection.get(i);
            if (num > 5) {
                newCollection.add(i);
            }
        }
        System.out.println("newCollection: " + newCollection);

        // Remove elements greater than 20 from myCollection
        myCollection.removeIf(num -> num > 20);//It is good
        System.out.println("myCollection after removing elements greater than 20: " + myCollection);

        // Insert elements 1, -3, -4 at positions 2, 8, 5 respectively
        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        System.out.println("myCollection after inserting elements: " + myCollection);

        // Sort and print myCollection
        myCollection.sort(Integer::compareTo);
        System.out.println("myCollection after sorting: " + myCollection);
    }
}

