package com.softserve.edu09.hm09.task1;

import java.util.*;

public class CollectionManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare collection myCollection of 10 integers and fill it from the console
        List<Integer> myCollection = new ArrayList<>();
        System.out.println("Please enter 10 integers to fill the collection:");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            myCollection.add(num);
        }

        // Task 1: Swap the maximum and minimum elements in the list
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) > myCollection.get(maxIndex)) {
                maxIndex = i;
            }
            if (myCollection.get(i) < myCollection.get(minIndex)) {
                minIndex = i;
            }
        }
        int temp = myCollection.get(maxIndex);
        myCollection.set(maxIndex, myCollection.get(minIndex));
        myCollection.set(minIndex, temp);
        System.out.println("After swapping max and min elements: " + myCollection);

        // Task 2: Insert a random three-digit number before the first negative element of the list
        Random random = new Random();
        int randNum = random.nextInt(900) + 100;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, randNum);
                break;
            }
        }
        System.out.println("After inserting random three-digit number: " + myCollection);

        // Task 3: Insert a zero between all neighboring elements with different signs
        for (int i = 0; i < myCollection.size() - 1; i++) {
            int curr = myCollection.get(i);
            int next = myCollection.get(i + 1);
            if (curr != 0 && next != 0 && curr * next < 0) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }
        System.out.println("After inserting zeros: " + myCollection);

        // Task 4: Copy the first k elements to list1, in direct order, and the rest to list2 in reverse order
        int k = 5;
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        Collections.reverse(list2);
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        // Task 5: In myCollection, remove the last even element (if there are even elements in the list)
        int lastEvenIndex = -1;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                lastEvenIndex = i;
                break;
            }
        }
        if (lastEvenIndex != -1) {
            myCollection.remove(lastEvenIndex);
            System.out.println("After removing last even element: " + myCollection);
        } else {
            System.out.println("There are no even elements in the collection.");
        }

        // Task 6: Remove from myCollection the element following the first minimum
        int firstMinIndex = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) < myCollection.get(firstMinIndex)) {
                firstMinIndex = i;
            }
        }
        if (firstMinIndex < myCollection.size() - 1) {
            myCollection.remove(firstMinIndex + 1);
            System.out.println("After removing element following first minimum: " + myCollection);
        } else {
            System.out.println("The minimum element is the last one, no element to remove.");
        }

        scanner.close();

    }
}
