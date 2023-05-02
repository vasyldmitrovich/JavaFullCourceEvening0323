package com.softserve.edu10.hw.Task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> personsMap = new HashMap<>();
        //You can create method and this method return Map<String,String>, there call this method and set to var personsMap
        personsMap.put("Franko", "Ivan");
        personsMap.put("Shevchenko", "Taras");
        personsMap.put("Leontovich", "Mikola");
        personsMap.put("Ukrainka", "Lesia");
        personsMap.put("Kurbas", "Oles");
        personsMap.put("Cisik", "Kvinka");
        personsMap.put("Simonenko", "Vasil");
        personsMap.put("Stus", "Vasil");
        personsMap.put("Kostenko", "Lina");
        personsMap.put("Dovzhenko", "Oleksandr");
        personsMap.put("Orest", "Orest");
        System.out.println(personsMap);
        Set<Map.Entry<String, String>> entrySet = personsMap.entrySet();
        int entrySetSize = entrySet.size();
        Set<String> uniqueLastName = new HashSet<>();
        String key = null;

        for (Map.Entry<String, String> set : entrySet) {
            uniqueLastName.add(set.getValue());
            if ((set.getValue()).equals("Orest")) {
                key = set.getKey();
            }
        }

        personsMap.remove(key);
        if (uniqueLastName.size() < entrySetSize) {
            System.out.println("\nAt least two or more people with the same name.\n");
        } else {
            System.out.println("\nThere are no people with the same name.\n");
        }

        System.out.println(personsMap);
    }
}
