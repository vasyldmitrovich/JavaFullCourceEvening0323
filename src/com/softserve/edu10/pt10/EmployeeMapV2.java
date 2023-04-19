package com.softserve.edu10.pt10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMapV2 {
    public static void main(String[] args) {
        // Initialize the employeeMap
        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(1, new Employee("Oleksandr", "CEO", 50000, "1980-01-01"));
        employeeMap.put(2, new Employee("Yarema", "Developer", 60000, "1985-02-02"));
        employeeMap.put(3, new Employee("Yakum", "Developer", 60000, "1985-03-03"));
        employeeMap.put(4, new Employee("Solomia", "HR manager", 40000, "1990-04-04"));
        employeeMap.put(5, new Employee("Martun", "Salesperson", 40000, "1990-05-05"));
        employeeMap.put(6, new Employee("Sofia", "Manager", 55000, "1982-06-06"));
        employeeMap.put(7, new Employee("Inokentiy", "Best", 25000, "1995-07-07"));

        // Display the contents of the employeeMap
        System.out.println("Employee Map Contents:");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            int id = entry.getKey();
            Employee employee = entry.getValue();
            System.out.println("ID: " + id + ", Employee: " + employee);
        }

        // Prompt the user to enter an ID
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ID: ");
        int id = scanner.nextInt();

        // Find the corresponding employee in the employeeMap and display the information
        if (employeeMap.containsKey(id)) {
            Employee employee = employeeMap.get(id);
            System.out.println("Employee: " + employee);
        } else {
            System.out.println("ID not found in the map.");
        }

        // Prompt the user to enter information for a new employee
        scanner.nextLine(); // Consume the newline character from previous input
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter position: ");
        String position = scanner.nextLine();
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter date of birth (yyyy-MM-dd): ");
        String dob = scanner.next();

        // Add the new employee to the employeeMap
        int newId = employeeMap.size() + 1;
        Employee newEmployee = new Employee(name, position, salary, dob);
        employeeMap.put(newId, newEmployee);
        System.out.println("Data added to the map: ID=" + newId + ", Employee=" + newEmployee);

        scanner.close();
    }
}
