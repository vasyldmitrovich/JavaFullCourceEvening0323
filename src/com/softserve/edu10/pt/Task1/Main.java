package com.softserve.edu10.pt.Task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> employeeMap = new HashMap<>();
        fillMap(employeeMap);
        System.out.println(employeeMap);
        System.out.print("Enter id: ");
        System.out.println("Name: " + findById(employeeMap, scanner.nextInt()));
        System.out.print("Enter name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        if (findByName(employeeMap, name) == null) {
            System.out.println("Name is not found in map");
        } else {
            System.out.println("Id: " + findByName(employeeMap, name));
        }
    }

    private static void fillMap(Map<Integer, String> hashMap) {
        hashMap.put(1, "Bozhen1");
        hashMap.put(2, "Bozhen2");
        hashMap.put(3, "Bozhen3");
        hashMap.put(4, "Bozhen4");
        hashMap.put(5, "Bozhen5");
        hashMap.put(6, "Bozhen6");
        hashMap.put(7, "Bozhen7");
    }

    private static String findById(Map<Integer, String> hashMap, int id) {
        return (String) hashMap.getOrDefault(id, "Id is not found in map");
    }

    private static Integer findByName(Map<Integer, String> hashMap, String name) {//Ok
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            if (name.equalsIgnoreCase(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
