package com.softserve.edu10.hw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HomeWork2 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Brown", "Jed");
        personMap.put("Neufeld", "Herbert");
        personMap.put("Blair", "Howard");

        for (Map.Entry<String, String> teacher : personMap.entrySet()) {
            System.out.println(teacher.getValue() + " " + teacher.getKey());
        }
        System.out.println();
        System.out.println("Teachers (key and value): " + personMap);

        boolean duplicateName = false;
        Set<String> firstName = new HashSet<>();
        for (String firstN : personMap.values()) {
            if (!firstName.add(firstN)) {
                duplicateName = true;
                break;
            }
        }
        if (duplicateName) {
            System.out.println("We have a duplicate name in this list!");
        } else {
            System.out.println("We don't have a duplicate name in this list.");
        }

        personMap.remove("Brown");

        System.out.println("Teachers (key and value): " + personMap);
    }
}
