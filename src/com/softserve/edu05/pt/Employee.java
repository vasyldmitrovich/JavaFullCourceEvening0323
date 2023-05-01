package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class Employee {
    private String name;
    private int department;
    private double salary;

    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        // Створення 5 об'єктів Employee

        //Make method that return array of Employee, and there in this line call method
        Employee[] employees = {
                new Employee("John Doe", 1, 2500.0),
                new Employee("Jane Smith", 1, 3000.0),
                new Employee("Bob Johnson", 2, 2000.0),
                new Employee("Mary Brown", 3, 3500.0),
                new Employee("Peter Lee", 3, 4000.0)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number department: ");
        int department = scanner.nextInt();

        // Make method and this logic move to this method
        System.out.println("List of employees of the department " + department + ":");
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.getName() + ", salary: " + employee.getSalary());
            }
        }

        Arrays.sort(employees, (e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));

        //With this logic do the same, create method put in method list and in method print what you want
        System.out.println("List of employees by field salaries:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ", salary: " + employee.getDepartment() + ", salary: " + employee.getSalary());
        }
    }
}
