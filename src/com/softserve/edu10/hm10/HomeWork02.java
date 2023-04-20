package com.softserve.edu10.hm10;

import java.util.HashMap;
import java.util.Map;

public class HomeWork02 {
    public static void main(String[] args) {
        // Create the personMap
        Map<String, String> personMap = new HashMap<>();

        // Populate the personMap with 10 entries
        personMap.put("Doe", "John");
        personMap.put("Smith", "Jane");
        personMap.put("Johnson", "Michael");
        personMap.put("Brown", "Emily");
        personMap.put("Lee", "William");
        personMap.put("Taylor", "Olivia");
        personMap.put("Anderson", "Sophia");
        personMap.put("Wilson", "James");
        personMap.put("Harris", "Emma");
        personMap.put("Jackson", "Orest");

        // Display the contents of the personMap
        System.out.println("Contents of personMap:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last Name: " + entry.getKey() + ", First Name: " + entry.getValue());
        }

        // Check if there are at least two persons with the same first name
        boolean hasDuplicateFirstName = false;
        for (String firstName : personMap.values()) {
            if (countOccurrences(personMap, firstName) >= 2) {
                hasDuplicateFirstName = true;
                break;
            }
        }

        if (hasDuplicateFirstName) {
            System.out.println("There are at least two persons with the same first name.");
        } else {
            System.out.println("There are no two persons with the same first name.");
        }

        // Remove the person with the first name "Orest" (or any other specified name)
        String firstNameToRemove = "Orest";
        personMap.values().removeIf(firstName -> firstName.equals(firstNameToRemove));

        // Print the resulting personMap after removal
        System.out.println("Contents of personMap after removing the person with first name 'Orest':");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last Name: " + entry.getKey() + ", First Name: " + entry.getValue());
        }
    }

    // Helper method to count occurrences of a value in a map
    private static <K, V> int countOccurrences(Map<K, V> map, V value) {
        int count = 0;
        for (V v : map.values()) {
            if (v.equals(value)) {
                count++;
            }
        }
        return count;
    }
}
