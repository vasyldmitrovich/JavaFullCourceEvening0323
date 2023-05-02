package com.softserve.edu10.hm10;

import java.util.HashSet;
import java.util.Set;

public class HomeWork01 {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static void main(String[] args) {//All good
        // Create two pre-filled sets
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Perform union operation
        Set<Integer> unionSet = union(set1, set2);
        System.out.println("Union: " + unionSet);

        // Perform intersection operation
        Set<Integer> intersectSet = intersect(set1, set2);
        System.out.println("Intersection: " + intersectSet);
    }
}
