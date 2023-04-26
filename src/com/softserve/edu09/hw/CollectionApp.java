package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionApp {

    public static void main(String[] args) {
        List<Integer> numbers = generateNumbers(10);
        System.out.println("ArrayList: " + numbers);

        System.out.println("ArrayList: " + swapMinMaxElements(numbers));

        System.out.println("\nInsert random number before first negative element");
        Integer number1 = generateNumber(100, 200);
        int index = getFirstNegativeElement(numbers);
        numbers.add(index, number1);
        System.out.println("ArrayList: " + numbers);

        insertZero(numbers);
        System.out.println("ArrayList: " + numbers);

        List<Integer> list1 = copyFirstKElements(numbers, 8);
        System.out.println("List1: " + list1);
        List<Integer> list2 = copyOtherElements(numbers, 8);
        System.out.println("List2: " + list2);

        int indexLastEvenElement = getLastEvenElement(numbers);
        if (indexLastEvenElement == -1) {
            System.out.println("There is no even elements in list");
        } else {
            System.out.println("\nRemoving last even element in the list");
            numbers.remove(indexLastEvenElement);
            System.out.println("ArrayList: " + numbers);
        }

        Integer min = getMin(numbers);
        int indexMin = numbers.indexOf(min) + 1;
        if (indexMin != numbers.size()) {
            System.out.println("\nRemoving element following the minimum");
            numbers.remove(indexMin);
            System.out.println("ArrayList: " + numbers);
        }

    }

    public static List<Integer> copyFirstKElements(List<Integer> originList, int k) {
        System.out.println("\nCopy first K elements to list1 in direct order");
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i <= k-1; i ++) {
            newList.add(i, originList.get(i));
        }
        return newList;
    }

    public static List<Integer> copyOtherElements(List<Integer> originList, int k) {
        System.out.println("\nCopy rest of elements to list2 in reverse order");
        List<Integer> newList = new ArrayList<>();
        for (int i = originList.size(); i > k; i--) {
            newList.add(originList.get(i-1));
        }
        return newList;
    }

    public static Integer getLastEvenElement(List<Integer> numbers) {
        int index = -1;
        for (int i = numbers.size()-1; i >= 0; i--) {
            if (numbers.get(i) != 0 && numbers.get(i) % 2 == 0) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static List<Integer> swapMinMaxElements(List<Integer> numbers) {
        System.out.println("\nSwap maximum and minimum elements in the list");
        Integer min = getMin(numbers);
        int minIndex = numbers.indexOf(min);
        Integer max = getMax(numbers);
        int maxIndex = numbers.indexOf(max);
        numbers.set(minIndex, max);
        numbers.set(maxIndex, min);
        return numbers;
    }

    public static void insertZero(List<Integer> numbers) {
        System.out.println("\nInsert 0 between elements with different signs");
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i-1) > 0 && numbers.get(i) < 0) {
                numbers.add(i, 0);
            } else if (numbers.get(i-1) < 0 && numbers.get(i) > 0) {
                numbers.add(i, 0);
            }
        }
    }

    public static Integer getFirstNegativeElement(List<Integer> numbers) {
        Integer index = 0;
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < 0) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static Integer getMin(List<Integer> numbers) {
        Integer min = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        return min;
    }

    public static Integer getMax(List<Integer> numbers) {
        Integer max = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static List<Integer> generateNumbers(int count) {
        System.out.println("Generating random numbers in range [-10, 20]");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(generateNumber(-10, 20));
        }
        return numbers;
    }

    public static Integer generateNumber(int min, int max) {
        //System.out.println(String.format("Generating random numbers in range [%d, %d]", min, max));
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
