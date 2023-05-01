package com.softserve.edu09.pt09.pt3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Divide different logic to different methods
        System.out.println("Enter 10 numbers, separated by commas");
        Scanner scanner = new Scanner(System.in);
        String nums = scanner.nextLine();
        String[] temp = nums.split(",");
        List<Integer> myCollection = new ArrayList<>();
        for (String array : temp
        ) {
            myCollection.add(Integer.parseInt(array));
        }
        System.out.println(myCollection);
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println();
        System.out.println("All positions of element more than 5 in the collection");
        System.out.println(newCollection);
        System.out.println();
        List<Integer> tempCollection = new ArrayList<>(myCollection);
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                tempCollection.remove(myCollection.get(i));
            }
        }
        System.out.println("Remove elements, which are greater then 20");
        System.out.println(tempCollection);
        System.out.println();
        myCollection.clear();
        myCollection.addAll(tempCollection);
        tempCollection.clear();
        if (myCollection.size() < 2) {
            myCollection.add(1);
            myCollection.add(-4);
            myCollection.add(-3);
        } else if (myCollection.size() < 5) {
            myCollection.add(2, 1);
            myCollection.add(-4);
            myCollection.add(-3);
        } else if (myCollection.size() < 8) {
            myCollection.add(2, 1);
            myCollection.add(5, -4);
            myCollection.add(-3);
        } else {
            myCollection.add(2, 1);
            myCollection.add(5, -4);
            myCollection.add(5, -3);
        }
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position: " + i + ", value of element: " + myCollection.get(i));
        }
        Collections.sort(myCollection);
        System.out.println(myCollection);
    }
}


