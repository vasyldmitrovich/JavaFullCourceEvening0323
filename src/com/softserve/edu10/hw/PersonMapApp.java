package com.softserve.edu10.hw;

import java.util.HashMap;
import java.util.Map;

public class PersonMapApp {

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Olga", "Reva");
        personMap.put("Ivan", "Abcde");
        personMap.put("Petro", "Oprst");
        personMap.put("Orest", "Oprst");
        personMap.put("Olya", "Oprst");
        personMap.put("Masha", "Abcde");
        personMap.put("Orest", "Abcde");
        personMap.put("Petro", "Abcde");
        personMap.put("Petro", "Ivanov");
        System.out.println("Map created: " + personMap);
        // key is unique so created map does not contain elements with duplicated keys

        personMap.remove("Orest");
        System.out.println("Map after Orest removed: " + personMap);
    }
}
