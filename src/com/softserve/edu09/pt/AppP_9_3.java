package com.softserve.edu09.pt;

import java.util.*;

public class AppP_9_3 {
    public static void main(String[] args) {

        // Деколи код може видавати помилку, бо колекція заповнюється рандомними числами
        // Просто запустіть його декілька разів, щоб розмір колекції був правильний )

        //create list and random element
        Random random = new Random();
        List<Integer> myCollection = new ArrayList<>();

        //fill the list with random elements and print it
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(10,30);
            myCollection.add(num);
        }
        System.out.println(myCollection);

        // crate newCollection
        List<Integer> newCollection = new ArrayList<>();

        //find and add all elements with index > 5 to newCollection
        for (int i = 0; i < myCollection.size(); i++) {
            if (i > 5) {
                newCollection.add(myCollection.get(i));
            }
        }
        System.out.println(newCollection);

        // call iterator and  delete all elements > 20 from myCollection
        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element > 20) {
                iterator.remove();
            }
        }
        System.out.println(myCollection);

        //add elements and print myCollection

        myCollection.add(2, 1);
        myCollection.add(5, -4);
        myCollection.add(8, -3);

        for (int i = 0; i < myCollection.size(); i++) {
            int element = myCollection.get(i);
            System.out.println("position - " + i + ", value of element - " + element);
        }

        //sort myCollection
        Collections.sort(myCollection);
        System.out.println("myCollection sorted --> " + myCollection);
    }

    }
