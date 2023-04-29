package com.softserve.edu09.hw.Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new ArrayList<Integer>();

        randomFillList(myCollection, 10);

        printList(myCollection);

        swapMaxAndMin(myCollection);

        printList(myCollection);

        insertThreeDigitNumber(myCollection);

        printList(myCollection);

        zeroBetweenDifSigns(myCollection);

        printList(myCollection);

        copyListToTwoLists(myCollection);

        removeTheLastEvenElement(myCollection);

        printList(myCollection);

        removeElementAfterFirstMin(myCollection);

        printList(myCollection);
    }

    private static void randomFillList(ArrayList<Integer> list, int size) {
        Random random = new Random();

        for (int i = 0; i <= size; i++) {
            list.add(random.nextInt(-10, 10));
        }
        System.out.println("Original list: ");
    }

    private static void printList(List<Integer> list) {
        System.out.println(list);
    }

    private static void swapMaxAndMin(ArrayList<Integer> list) {
        int max = list.indexOf(Collections.max(list));
        int min = list.indexOf(Collections.min(list));
        Collections.swap(list, min, max);
        System.out.println("\nThe elements were swapped: \n" +
                list.get(max) + " in position " + max + " and " +
                list.get(min) + " in position " + min);
    }

    private static void insertThreeDigitNumber(ArrayList<Integer> list) {
        Random random = new Random();

        Iterator<Integer> iterator = list.iterator();
        int index = 0;
        int randNumber = random.nextInt(100, 1000);
        while (iterator.hasNext()) {
            if (iterator.next() < 0) {
                list.add(index, randNumber);
                break;
            }
            index++;
        }
        System.out.println("\nRandom three-digit number " + randNumber +
                " before first negative number");
    }

    private static void zeroBetweenDifSigns(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            boolean a = list.get(i) < 0 && list.get(i + 1) > 0;
            boolean b = list.get(i) > 0 && list.get(i + 1) < 0;
            if (a || b) {
                list.add(i + 1, 0);
            }
        }
        System.out.println("\nA zero between elements with different signs");
    }

    private static void copyListToTwoLists(ArrayList<Integer> list) {
        int k = list.size() / 2;
        List<Integer> list1 = new ArrayList<>(List.copyOf(list.subList(0, k)));
        List<Integer> list2 = new ArrayList<>(List.copyOf(list.subList(k, list.size())));
        Collections.reverse(list2);
        System.out.println("\nk = half of myCollection");
        System.out.println("list1: ");
        printList(list1);
        System.out.println("list2: ");
        printList(list2);
        System.out.println("myCollection: ");
        printList(list);
    }

    private static void removeTheLastEvenElement(ArrayList<Integer> list) {
        System.out.println(" ");
        Collections.reverse(list);
        boolean check = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0 && list.get(i) != 0) {
                System.out.println("Removed the last even element in list");
                System.out.println("Was deleted element " + list.get(i)
                        + " at position: " + (list.size() - 1 - i));
                list.remove(i);
                check = true;
                break;
            }
        }
        Collections.reverse(list);
        if (!check) {
            System.out.println("\nThere are not even elements in the list");
        }
    }

    private static void removeElementAfterFirstMin(ArrayList<Integer> list) {
        int minIndex = list.indexOf(Collections.min(list));
        int element = list.get(minIndex + 1);
        System.out.println(list.get(minIndex));
        if (minIndex == list.size()) {
            System.out.println("The min element is at the end");
        } else {
            list.remove(minIndex + 1);
            System.out.println("\nRemoved the element following the first minimum in the list");
            System.out.println("Was deleted element " + element + " at position: " + minIndex + 1);
        }

    }
}