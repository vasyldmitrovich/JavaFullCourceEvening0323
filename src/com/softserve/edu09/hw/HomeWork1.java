package com.softserve.edu09.hw;

import com.softserve.edu08.hw.FullName;
import com.softserve.edu08.hw.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class HomeWork1 {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(201) - 100);
        }
        System.out.println(myCollection);

        int min = 0;
        int max = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) > myCollection.get(max)) {
                max = i;
            }
            if (myCollection.get(i) < myCollection.get(min)) {
                min = i;
            }
        }
        int maxValue = myCollection.get(max);
        int minValue = myCollection.get(min);
        System.out.println(maxValue);
        System.out.println(minValue);

        myCollection.set(max, myCollection.get(min));
        myCollection.set(min, maxValue);
        System.out.println(myCollection.get(max));
        System.out.println(myCollection.get(min));

        int negative = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                negative = i;
                break;
            }
        }
        myCollection.add(negative, random.nextInt(900) + 100);
        System.out.println(myCollection);

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) * myCollection.get(i + 1) < 0) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }
        System.out.println(myCollection);

        int k = 3;
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        Collections.reverse(list2);
        System.out.println(list1);
        System.out.println(list2);

        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                break;
            }
        }
        System.out.println(myCollection);

        int minVal = Collections.min(myCollection);
        int indexMin = myCollection.indexOf(minVal);
        if (indexMin < myCollection.size() - 1) {
            myCollection.remove(indexMin + 1);
        }
        System.out.println(myCollection);
    }
}
