package com.softserve.edu10.hw10.hw1;

import java.util.HashSet;
import java.util.Set;

public class AppSet {
    public static void main(String[] args) {
        //Ok all is ok
        Set<Integer> integerSet1 = new HashSet<>();
        integerSet1.add(1);
        integerSet1.add(4);
        integerSet1.add(56);
        integerSet1.add(16);
        System.out.println("Set first " + integerSet1);
        Set<Integer> integerSet2 = new HashSet<>();
        integerSet2.add(1);
        integerSet2.add(9);
        integerSet2.add(-36);
        integerSet2.add(445);
        System.out.println("Set second " + integerSet2);
        Set<Integer> integerSet3 = new HashSet<>();
        integerSet3.add(3);
        integerSet3.add(16);
        integerSet3.add(-36);
        integerSet3.add(475);
        System.out.println("Set third " + integerSet3);
        System.out.println();
        System.out.println("Union of first and second, set fourth");
        Set<Integer> unionSet = new HashSet<>(union(integerSet1, integerSet2));
        System.out.println(unionSet);
        System.out.println();
        Set<Integer> intersectSet = new HashSet<>(intersect(integerSet1, integerSet3));
        System.out.println("Intersect of third and fourth " + intersectSet);
    }

    private static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        set1.addAll(set2);
        return set1;
    }

    private static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        set1.retainAll(set2);
        return set1;
    }
}
