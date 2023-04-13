package com.softserve.edu09.pt.Task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            myCollection.add(random.nextInt(25));
        }
        System.out.println("My original collection \n" + myCollection);

        //Find and save in list newCollection all positions of element more than 5 in the
        //collection. Output newCollection to the console;
        ArrayList<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println("\nAll positions of element more than 5 in the" + "collection \n" + newCollection);

        //Remove from collection myCollection elements, which are greater than 20. Output the
        //result
        myCollection.removeIf(integer -> integer > 20);
        System.out.println("\nAfter removing elements, which are greater then 20 \n" + myCollection);

        //Insert elements 1, -3, -4 in positions 2, 8, 5. Output the result in the format: “position –
        //xxx, value of element – xxx”
        if (myCollection.size() >= 8) {
            myCollection.add(2, 1);
            myCollection.add(5, -4);
            myCollection.add(8, -3);
            System.out.println("\nAfter inserting elements 1, -3, -4 in positions 2, 8, 5");
            for (int i = 0; i < myCollection.size(); i++) {
                System.out.println("Position – " + i + ", value of element – " + myCollection.get(i));
            }
        } else {
            System.out.println("\nSorry, but i can't insert these elements, `cause the list`s too small. " + "Try again");
        }

        //Sort and print collection.
        Collections.sort(myCollection);
        System.out.println("\nAfter sorting \n" + myCollection);

    }
}
