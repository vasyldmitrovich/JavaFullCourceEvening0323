package com.softserve.edu10.pt;

import com.softserve.edu09.pt.HeavyBox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PracticalTask1 {//Good
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Alex");
        employeeMap.put(2, "Dima");
        employeeMap.put(3, "Vitaliy");
        employeeMap.put(4, "Oleg");
        employeeMap.put(5, "Fedir");
        employeeMap.put(6, "Vasiliy");
        employeeMap.put(7, "Victor");

        System.out.println("List of employee (key and value): ");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        int id = scan.nextInt();

        if (employeeMap.containsKey(id)) {
            String name = employeeMap.get(id);
            System.out.println("Employee with " + id + " ID is " + name + ".");
        } else {
            System.out.println("There is no employee with this ID!");
        }

        System.out.print("Enter name of employee: ");
        String nameEmployee = scan.next();
        if (employeeMap.containsValue(nameEmployee)) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(nameEmployee)) {
                    int employeeId = entry.getKey();
                    System.out.println(nameEmployee + " have " + employeeId + " ID.");
                }
            }
        } else {
            System.out.println("We can't find this employee!");
        }
    }
}
