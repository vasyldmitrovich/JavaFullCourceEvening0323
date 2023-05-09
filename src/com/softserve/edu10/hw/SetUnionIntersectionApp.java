package com.softserve.edu10.hw;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class SetUnionIntersectionApp {

    /*
        Develop parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
        realizing the operations of union and intersection of two sets.
        Test the operation of these techniques on two pre-filled sets.
    */
    public static void main(String[] args) {
        Set<Integer> set1 = createSet(5);
        Set<Integer> set2 = createSet(6);

        union(set1, set2);
        intersection(set1, set2);
    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>();
        union.addAll(set1);
        union.addAll(set2);
        System.out.println("Set united: " + union);
        return union;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = set1.parallelStream()
                .filter(set2::contains)
                .collect(Collectors.toSet());
        System.out.println("Set intersection: " + intersection);
        return intersection;
    }

    public static Set<Integer> createSet(int setCount) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < setCount; i++) {
            set.add(generateNumber());
        }
        System.out.println("Set generated: " + set);
        return set;
    }

    public static Integer generateNumber() {
        Integer min = 0;
        Integer max = 10;
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
