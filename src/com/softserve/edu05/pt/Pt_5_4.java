package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Pt_5_4 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Maksym", 3, 30000),
                new Employee("Ivan", 2, 45000),
                new Employee("Ryslan", 5, 25000),
                new Employee("Yaroslav", 3, 35000),
                new Employee("Anton", 5, 20000)
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Department: ");
        int department_number = sc.nextInt();
        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() == department_number) {
                System.out.println("Employee from " + department_number + " department: " + employee.getName());
            }
        }


        Arrays.sort(employees, Comparator.comparingInt(Employee::getSalary).reversed());
        System.out.println("\n All employee sorted by salary in descending order: ");
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + " Salary: " + employee.getSalary());

        }

    }


}
