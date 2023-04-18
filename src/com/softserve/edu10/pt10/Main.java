package com.softserve.edu10.pt10;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> employeeMap = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            populateMap(employeeMap);
        }
        System.out.println(employeeMap);
        System.out.println();
        System.out.println("Input id of employee that you'd like to find");
        int key = sc.nextInt();
        findByKey(employeeMap, key);
        System.out.print("Input name of employee that you'd like to find - ");
        String name = sc.next();
        findByName(employeeMap, name);
        System.out.println("Input name of employee that you'd like to add");
        String nameNew = sc.next();
        System.out.println("Input id of employee that you'd like to add");
        int keyNew = sc.nextInt();
        addElements(employeeMap, nameNew, keyNew);
    }

    private static Map<Integer, String> populateMap(Map<Integer, String> map) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name of employee");
        String name = sc.nextLine();
        System.out.println("Input id of employee");
        int id = sc.nextInt();
        map.put(id, name);
        return map;
    }

    private static boolean findByKey(Map<Integer, String> map, int key) {
        if (map.containsKey(key)) {
            System.out.println(map.get(key));
        } else System.out.println("There is no such employee");
        return map.containsKey(key);
    }

    private static boolean findByName(Map<Integer, String> map, String name) {
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> pair : entries) {
            if (name.equals(pair.getValue())) {
                System.out.println("ID of that employee " + pair.getKey());
                return map.containsValue(name);
            }
        }
        System.out.println("There is no such employee");
        return map.containsValue(name);
    }

    private static void addElements(Map<Integer, String> map, String name, int id) {
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> pair : entries) {
            if (name.equals(pair.getValue()) && id == pair.getKey()) {
                System.out.println("Such employee is already exist");
            } else {
                map.put(id, name);
                System.out.println("Employee entered");
            }
            break;
        }
    }
}
