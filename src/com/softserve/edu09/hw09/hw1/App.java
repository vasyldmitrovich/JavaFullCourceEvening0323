package com.softserve.edu09.hw09.hw1;

import java.util.*;

public class App {
    public static void main(String[] args) {
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
        System.out.println("Maximum element");
        System.out.println(Collections.max(myCollection));
        System.out.println("Minimum element");
        System.out.println(Collections.min(myCollection));
        System.out.println();
        System.out.println("Edd 3 elements before first negative");
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, (int) (Math.random() * 20 - 10));
                myCollection.add(i, (int) (Math.random() * 20 - 10));
                myCollection.add(i, (int) (Math.random() * 20 - 10));
                break;
            }
        }
        System.out.println(myCollection);
        System.out.println();
        System.out.println("Insert 0 between '+' and '-'");
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if ((myCollection.get(i) < 0) && (myCollection.get(i + 1) > 0) || (myCollection.get(i) > 0) && (myCollection.get(i + 1) < 0)) {
                myCollection.add(i + 1, 0);
            }
        }
        System.out.println(myCollection);
        System.out.println();
        System.out.println("Enter number from 1 to 13");
        int k = scanner.nextInt();
        System.out.println("Two separate lists");
        List<Integer> list1 = myCollection.subList(0, k);
        System.out.println(list1);
        List<Integer> list2 = myCollection.subList(k, myCollection.size());
        System.out.println(list2);
        System.out.println();
        System.out.println("Delete last even element");
        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if ((myCollection.get(i)) % 2 == 0) {
                list3.add(myCollection.get(i));
            }
        }
        if (list3.size() == 0) {
            System.out.println("There is no even elements");
        } else {
            myCollection.remove(list3.get(list3.size() - 1));
        }
        System.out.println(myCollection);
        System.out.println();
        System.out.println("Remove the element following the first minimum");
        int min = Collections.min(myCollection);
        if (myCollection.get(myCollection.size() - 1) == min) {
            System.out.println("It's the last");
        } else {
            for (int i = 0; i < myCollection.size() - 1; i++) {
                if (min == myCollection.get(i)) {
                    myCollection.remove(i + 1);
                    break;
                }
            }
        }
        System.out.println(myCollection);
    }
}

