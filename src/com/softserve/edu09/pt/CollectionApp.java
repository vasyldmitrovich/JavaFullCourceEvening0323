package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionApp {
    public static void main(String[] args) {
        List<Integer> myCollection = inputCollection();

        List<Integer> newCollection = getElementsPosition(myCollection);
        outputPositions("Find all positions of elements more than 5", newCollection);

        myCollection.removeAll(getElementsGreater20(myCollection));
        outputCollection("Remove from collection elements greater then 20", myCollection);

        myCollection.add(2, 1);
        myCollection.add(5, -4);
        myCollection.add(8, -3);
        outputCollection("Inserted new values to collection", myCollection);

        Collections.sort(myCollection);
        outputCollection("Sorted collection", myCollection);
    }

    public static List<Integer> inputCollection() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            System.out.print(String.format("Enter [%d] number: ", i));
            numbers.add(scanner.nextInt());
        }
        return numbers;
    }

    public static void outputCollection(String message, List<Integer> collection) {
        System.out.println(message);
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(String.format("Position: %d, value: %s", i ,collection.get(i)));
        }
    }

    public static void outputPositions(String message, List<Integer> collection) {
        System.out.println(message);
        for (Integer numbers: collection) {
            System.out.println("Position is: "+ numbers);
        }
    }

    public static List<Integer> getElementsPosition(List<Integer> collection) {
        List<Integer> positions = new ArrayList<>();
        for (Integer number: collection) {
            if (number > 5) {
                positions.add(collection.indexOf(number));
            }
        }
        return positions;
    }

    public static List<Integer> getElementsGreater20(List<Integer> collection) {
        List<Integer> numbersGreater20 = new ArrayList<>();
        for (Integer number: collection) {
            if (number > 20) {
                numbersGreater20.add(number);
            }
        }
        return numbersGreater20;
    }
}
