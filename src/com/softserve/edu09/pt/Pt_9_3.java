package com.softserve.edu09.pt;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;

public class Pt_9_3 {
    public static void main(String[] args) {
    Random random = new Random();
//        Create new List with random numbers
        ArrayList<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(0,100);
            myCollection.add(num);
        }
        System.out.println(myCollection);


//          find all numbers position >5
        List<Integer> newCollection = new ArrayList<>();
        for(int i = 0; i<myCollection.size();i++ ){
            if(i>5){
                newCollection.add(myCollection.get(i));

            }

        }
        System.out.println(newCollection);

//        Remove from collection myCollection elements, which are greater then 20

        myCollection.removeIf(integer -> integer > 20);
        System.out.println(myCollection);

//      Insert elements 1, -3, -4 in positions 2, 8, 5.
        myCollection.clear();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(0,100);
            myCollection.add(num);
        }
        myCollection.add(2, 1);
        myCollection.add(5, -4);
        myCollection.add(8, -3);



        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position: " + i + ", value: " + myCollection.get(i));
        }

        // Sort
        myCollection.sort(Integer::compareTo);
        System.out.println("Sorted collection: " + myCollection);

    }
}
