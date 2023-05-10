package com.softserve.edu09.pt;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Pt09 {
    public static void main(String[] args) {
//Task 1
        System.out.println("Task 1:");
        HeavyBox box1 = new HeavyBox(5, "Salt");
        HeavyBox box2 = new HeavyBox(15, "Water");
        HeavyBox box3 = new HeavyBox(20, "Steel");
        HeavyBox box4 = new HeavyBox(25, "Lead");
        HeavyBox box5 = new HeavyBox(35, "Uranium");

        List<HeavyBox> list = new ArrayList();
        list.addAll(List.of(box1, box2, box3, box4, box5));
        System.out.println("Description of source data:");
        for (HeavyBox b : list) {
            System.out.println(b);
        }
        System.out.println("List size: " + list.size());
        System.out.println("\nChange the weight of the first box by 1.");
        System.out.print("Box1 current weight: ");
        System.out.println(box1.getWeight());
        box1.setWeight(box1.getWeight() + 1);
        System.out.print("Box1 weight + 1 = ");
        System.out.println(box1.getWeight());

        System.out.println("\r\nRemove the last box.");
        list.remove(list.size() - 1);
        for (HeavyBox b : list) {
            System.out.println(b);
        }
        System.out.println("List size: " + list.size());

        System.out.println("\r\nList clear()");
        list.clear();
        System.out.println("List size: " + list.size());

//Task 2
        System.out.println("Task 2:");
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(1, 2, 3, 4, 4, 5, 6, 6, 7, 8));
        System.out.println("Starting with these numbers: " + numbers);
        List<Integer> withoutDuplicates = new ArrayList<>(new HashSet<>(numbers));
        System.out.println("Result without duplicates: " + withoutDuplicates);
//Task 3
        System.out.println("Task 3:");
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i <= 9; i++)
            myCollection.add(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.println("myCollection: " + myCollection);
        List<Integer> newCollection = new ArrayList<>();
        int counter = 0;
        for (Iterator<Integer> iter = myCollection.iterator(); iter.hasNext(); counter++) {
            Integer i = iter.next();
            if (i > 5) {
                newCollection.add(counter);
            }
        }
        System.out.println("newCollection: " + newCollection);
        System.out.println("Remove from myCollection >20: ");
        myCollection.removeIf(i -> i > 20);
        System.out.println("myCollection: " + myCollection);

        System.out.println("Insert elements 1, -3, -4 in positions 2, 8, 5:");
        if (myCollection.size() <= 8) {
            int insertNulls = 8 - myCollection.size();
            for (int i = 0; i < insertNulls; i++) {
                myCollection.add(0);
            }
        }
        System.out.println("myCollection: " + myCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        Collections.sort(myCollection);
        System.out.println("myCollection Sorted: " + myCollection);

    }
}
