package com.softserve.edu07.hw07;

import java.util.Arrays;
import java.util.Comparator;

public class HomeWork01 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new SalariedEmployee("1", 10, 160, "123-45-6789", "John Smith");
        employees[1] = new SalariedEmployee("2", 20, 160, "987-65-4321", "Jane Doe");
        employees[2] = new ContractEmployee("3", 4000, "555-55-5555", "Bob Johnson");
        employees[3] = new ContractEmployee("4", 6000, "666-66-6666", "Alice Williams");
        employees[4] = new SalariedEmployee("5", 15, 200, "999-99-9999", "Tom Lee");

        Arrays.sort(employees, Comparator.comparingDouble(Employee::calculatePay).reversed());

        for (Employee employee : employees) {
            double monthlySalary = employee.calculatePay() * 4; // assuming 4 weeks in a month
            System.out.printf("ID: %s, Name: %s, Avg. Monthly Salary: $%.2f%n", employee.employeeId, employee.name, monthlySalary);
        }
    }
}
