package com.softserve.edu10.pt10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMapV1 {
    public static void main(String[] args) {
        // Initialize the employeeMap
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Oleksandr");
        employeeMap.put(2, "Vsevolod");
        employeeMap.put(3, "Yarema");
        employeeMap.put(4, "Mstuslav");
        employeeMap.put(5, "Zoreslav");
        employeeMap.put(6, "Lybusta");
        employeeMap.put(7, "Вірмена");

        // Display the contents of the employeeMap
        System.out.println("Employee Map Contents: " + employeeMap);

        // Prompt the user to enter an ID
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ID: ");
        int id = scanner.nextInt();

        // Find the corresponding name in the employeeMap and display it
        if (employeeMap.containsKey(id)) {
            String name = employeeMap.get(id);
            System.out.println("Name: " + name);
        } else {
            System.out.println("ID not found in the map.");
        }

        // Prompt the user to enter a name
        System.out.print("Enter a name: ");
        scanner.nextLine(); // Consume the newline character from previous input
        String name = scanner.nextLine();

        // Verify that the name exists in the employeeMap and display the corresponding ID
        boolean nameFound = false;
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {//Nice
            if (entry.getValue().equals(name)) {
                System.out.println("ID: " + entry.getKey());
                nameFound = true;
                break;
            }
        }
        if (!nameFound) {
            System.out.println("Name not found in the map.");
        }

        /*
        Task**
         */
        // Check for duplicate values in the employeeMap
        if (employeeMap.containsValue(name)) {
            System.out.println("Name already exists in the map. Data addition halted.");
        } else {
            // Add the ID-name pair to the employeeMap
            int newId = employeeMap.size() + 1;
            employeeMap.put(newId, name);
            System.out.println("Data added to the map: ID=" + newId + ", Name=" + name);
        }

        scanner.close();
    }
}
