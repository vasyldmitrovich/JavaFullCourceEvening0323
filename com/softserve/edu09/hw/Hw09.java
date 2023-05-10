package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Hw09 {
    public static void main(String[] args) {
        //Task 1
        //p.1
        System.out.println("Task 1:");
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i <= 9; i++)
            myCollection.add(ThreadLocalRandom.current().nextInt(-100, 100));
        System.out.println("myCollection: " + myCollection);
        int minIndex = myCollection.indexOf (Collections.min(myCollection));
        int maxIndex = myCollection.indexOf (Collections.max(myCollection));
        Collections.swap(myCollection, minIndex, maxIndex);
        System.out.println("myCollection with swap min/max: " + myCollection);

        //p.2
        System.out.println("Task 2:");
        int firstNegative = myCollection.stream()
                .filter(num -> num<0)
                .findAny()
                .orElse(null);
        int indxOfFirstNegative = myCollection.indexOf(firstNegative);
        System.out.println("Index of the first negative number: " + indxOfFirstNegative);
        myCollection.add(indxOfFirstNegative,ThreadLocalRandom.current().nextInt(100, 999));
        System.out.println("RND added before first negative in myCollection: " + myCollection);

        //p.3
        List<Integer> listOfIndex = new ArrayList<>();
        for(int i = 0; i < (myCollection.size()-1); i++){ //-1 because number of elements is bigger than number of indx
            if((myCollection.get(i)<0 & myCollection.get(i+1)>=0) || myCollection.get(i)>=0 & myCollection.get(i+1)<0){
                listOfIndex.add(i+1); // this index will be used to insert 0 next to myCollection.get(i)
            }
        }
        System.out.println("listOfIndex: " + listOfIndex);
        int shift = 0; // ohhh... smells like teen spirit )))) used instead of Iterator + lambda/ana
        for(int ind : listOfIndex){
            myCollection.add(ind+shift,0);
            shift++;
        }
        System.out.println("myCollection with 0 between - and +: " + myCollection);

        //p.4
        System.out.print("Input 'k' as an integer from 0 to " + (myCollection.size()-1) + ": ");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        List<Integer> list1 = myCollection.subList(0,k);
        List<Integer> list2 = myCollection.subList(k,myCollection.size());
        Collections.reverse(list2);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        //p.5
        System.out.println();
        System.out.println("myCollection current state:             " + myCollection);
        int lastEven = -1;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                lastEven = i;
                break;
            }
        }

        if (lastEven != -1) {
            myCollection.remove(lastEven);
            System.out.print("myCollection without last even number: " + myCollection);
        } else {
            System.out.println("There is no even number in the array.");
        }

        //p.6
        System.out.println();
        int minIndx = myCollection.indexOf(Collections.min(myCollection));
        if (minIndx < (myCollection.size()-1)){
            myCollection.remove(minIndx+1);
        }
        System.out.print("myCollection without next after min: " + myCollection);
    }
}
