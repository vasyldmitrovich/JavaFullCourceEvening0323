/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.edu10.hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author rgonchar
 */
public class Hw10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        Set<Integer> s1 = new HashSet();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);

        // Creating the second set  
        Set<Integer> s2 = new HashSet();
        s2.add(6);
        s2.add(7);
        s2.add(3);
        s2.add(9);
        s2.add(5);

        Set<Integer> union = new HashSet<>(s1);
        Set<Integer> intersect = new HashSet<>(s1);
        union.addAll(s2);
        intersect.retainAll(s2);

        // Displaying the union of set set1 and set2  
        System.out.println("Set 1: " + s1);
        System.out.println("Set 2: " + s2);
        System.out.println("Union with addAll: " + union);
        System.out.println("Intersect with retainAll: " + intersect);

        System.out.println("Union with custom union method: " + union(s1, s2));
        System.out.println("Intersect with custom intersect method: " + intersect(s1, s2));

        System.out.println();
        System.out.println("Task 2");

        //Task 2
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Lutyy", "Orest");
        personMap.put("Bogun", "Ivan");
        personMap.put("Mazepa", "Ivan");
        personMap.put("Bandera", "Stepan");
        personMap.put("Hmelnytskiy", "Bogdan");
        personMap.put("Shevchenko", "Taras");
        personMap.put("Chornovol", "Taras");
        personMap.put("Grytsenko", "Andriy");
        personMap.put("Klychko", "Vitaliy");
        personMap.put("Prokopenko", "Volodymyr");
        System.out.println("Current list of personMap: ");

        //create map with name:count
        HashMap<String, Integer> countMap = new HashMap<String, Integer>();
        for (Entry<String, String> entry : personMap.entrySet()) {
            String lastName = entry.getKey();
            String name = entry.getValue();
            System.out.println("Name: " + name + ", Last Name: " + lastName);
            if (countMap.containsKey(name)) {
                int count = countMap.get(name) + 1;
                countMap.put(name, count);
            } else {
                countMap.put(name, 1);
            }
        }
        //Output list of duplicated names with count
        System.out.println("Count of duplicated names:");
        for (Map.Entry entry : countMap.entrySet()) {
            if ((Integer) entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

        System.out.println();
        while (personMap.values().remove("Orest"));
        System.out.println("After Orest remove: ");
        for (Entry<String, String> entry : personMap.entrySet()) {
            String lastName = entry.getKey();
            String name = entry.getValue();
            System.out.println("Name: " + name + ", Last Name: " + lastName);
        }

        //Task 3
        System.out.println();
        System.out.println("Task 3");
        List<Student> students = new ArrayList();
        students.add(new Student("Vasia", 3));
        students.add(new Student("Lisa", 3));
        students.add(new Student("Petia", 2));
        students.add(new Student("Kolja", 1));
        students.add(new Student("Dima", 4));

        Student.printStudents(students, 3);

        System.out.println();
        System.out.println("Compare by name: ");
        System.out.println(Student.compareByName(students.get(0), students.get(1)));
        System.out.println("Compare by course: ");
        System.out.println(Student.compareByCourse(students.get(0), students.get(1)));

        System.out.println();
        students.sort((Student st1, Student st2) -> st1.getName().compareTo(st2.getName()));
        System.out.println("Sorted by name: ");
        for (Student s : students) {
            System.out.println(s.getName() + " " + s.getCourse());
        }
        System.out.println();
        students.sort((Student st1, Student st2) -> Integer.compare(st1.getCourse(),st2.getCourse()));
        System.out.println("Sorted by coourse: ");
        for (Student s : students) {
            System.out.println(s.getName() + " " + s.getCourse());
        }
    }

    public static Set union(Set s1, Set s2) {
        Set result = new HashSet<>(s1);
        Iterator<Integer> iterator = s2.iterator();
        while (iterator.hasNext()) {

            Integer element = iterator.next();
            if (!s1.contains(element)) {
                result.add(element);
            }

        }
        return result;
    }

    public static Set intersect(Set s1, Set s2) {
        Set result = new HashSet<>();
        Iterator<Integer> iterator = s2.iterator();
        while (iterator.hasNext()) {

            Integer element = iterator.next();
            if (s1.contains(element)) {
                result.add(element);
            }

        }
        return result;
    }

}
