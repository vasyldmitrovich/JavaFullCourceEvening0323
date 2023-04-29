package com.softserve.edu10.hw.Task1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(5);
        set1.add(10);
        set1.add(12);
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(5);
        set2.add(10);
        set2.add(14);

        Set<Integer> set = union(set1, set2);
        System.out.println("Union: " + set);
        set = intersect(set1, set2);
        System.out.println("Intersect: " + set);
    }

    private static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    private static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }
}
