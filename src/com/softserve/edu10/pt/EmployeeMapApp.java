package com.softserve.edu10.pt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMapApp {

    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(100, "Olga Reva");
        employeeMap.put(101, "Olga Ivanova");
        employeeMap.put(102, "Petr Petrov");
        employeeMap.put(103, "Julia Petrova");
        employeeMap.put(104, "Andrew Smith");
        employeeMap.put(105, "Andrew Ivanov");
        employeeMap.put(106, "Ivan Yerko");

        for (Map.Entry m : employeeMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter employee ID: ");
        Integer id = scanner.nextInt();

        if (employeeMap.containsKey(id)) {
            System.out.println("Employee found: " + id + " " + employeeMap.get(id));
        } else {
            System.out.println("There is no employee with entered ID");
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please, enter employee Name: ");
        String name = scanner2.nextLine();

        if (employeeMap.containsValue(name)) {
            for (Map.Entry m : employeeMap.entrySet()) {
                if (m.getValue().equals(name)) {
                    System.out.println("Employee found: " + m.getKey() + " " + m.getValue());
                    break;
                }
            }
        } else {
            System.out.println("There is no employee with entered Name");
        }
    }
}
