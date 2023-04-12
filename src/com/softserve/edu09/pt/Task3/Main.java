package com.softserve.edu09.pt.Task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            myCollection.add(random.nextInt(40));
        }
        System.out.println("My original collection \n" + myCollection);
        ArrayList<Integer> newCollection = new ArrayList<>();

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println("\nAll positions of element more than 5 in the" +
                "collection \n" + newCollection);
        myCollection.removeIf(integer -> integer > 20);
        System.out.println("\nAfter removing elements, which are greater then 20 \n" + myCollection);
        Collections.sort(myCollection);
        System.out.println("\nAfter sorting \n" + myCollection);
    }
}
