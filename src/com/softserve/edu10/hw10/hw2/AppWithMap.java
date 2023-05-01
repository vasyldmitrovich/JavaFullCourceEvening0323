package com.softserve.edu10.hw10.hw2;

import java.util.*;

public class AppWithMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> persons = new HashMap<>();
        //This code is nice, respect
        for (int i = 0; i < 3; i++) {
            persons = populateMap(persons);
        }
        for (Map.Entry entries : persons.entrySet()) {
            System.out.println(entries.getKey() + " " + entries.getValue());
        }
        comparePersons(persons);
        deleteByName(persons, "Tanya");
        for (Map.Entry entries : persons.entrySet()) {
            System.out.println(entries.getKey() + " " + entries.getValue());
        }
    }

    private static Map<String, String> populateMap(Map<String, String> map) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name of person ");
        String name = sc.nextLine();
        System.out.println("Input surname of person ");
        String surname = sc.nextLine();
        map.put(surname, name);
        return map;
    }

    private static boolean comparePersons(Map<String, String> map) {
        Set<String> stringSet = new HashSet<>();
        int sizeMap = map.size();
        for (Map.Entry<String, String> pair1 : map.entrySet()) {
            stringSet.add(pair1.getValue());
        }
        if (sizeMap == stringSet.size()) {
            System.out.println("There aren't duplicates");
            return false;
        } else {
            System.out.println("There are at least two duplicates");
            return true;
        }
    }

    private static void deleteByName(Map<String, String> map, String name) {
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> pair : entries) {
            if (name.equals(pair.getValue())) {
                map.remove(pair.getKey(), pair.getValue());
            }
            break;
        }
    }
}
