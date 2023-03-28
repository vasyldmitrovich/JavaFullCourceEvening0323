package com.softserve.edu05.pt;

import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Olya", 501, 5500.0);
        Employee employee2 = new Employee("Anya", 501, 3500.0);
        Employee employee3 = new Employee("Katya", 502, 4000.0);
        Employee employee4 = new Employee("Nikita", 503, 900.0);
        Employee employee5 = new Employee("Alex", 503, 5100.0);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input department number ");
        Integer input = scanner.nextInt();

        boolean found = false;
        for (Employee empl: employees) {
            if (empl.getDepartmentNumber().equals(input)) {
                System.out.println("Worked in department: " + empl);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees in entered department or entered wrong department number!");
        }

        System.out.println("\n\nArrange workers by the field salary in descending order:");
        Employee tmp;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].getSalary() < employees[j].getSalary()) {
                    tmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmp;
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

}
