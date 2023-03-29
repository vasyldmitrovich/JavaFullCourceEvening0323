package com.softserve.edu05.pt05;
import java.util.Scanner;
public class PracticalTask04 {

//        Employee employee1 = new Employee("John Smith", 1, 5000);
//        Employee employee2 = new Employee("Mary Johnson", 2, 6000);
//        Employee employee3 = new Employee("David Lee", 1, 8000);
//        Employee employee4 = new Employee("Karen Brown", 3, 4500);
//        Employee employee5 = new Employee("Robert Johnson", 2, 7000);
        public static void main(String[] args) {
            Employee[] employees = {
                    new Employee("John", 1, 50000),
                    new Employee("Jane", 2, 60000),
                    new Employee("Bob", 1, 45000),
                    new Employee("Mary", 2, 55000),
                    new Employee("Tom", 3, 70000)
            };

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter department number: ");
            int departmentNumber = scanner.nextInt();
            System.out.println("Employees in department " + departmentNumber + ":");

            for (Employee employee : employees) {
                if (employee.getDepartmentNumber() == departmentNumber) {
                    System.out.println(employee.getName());
                }
            }

            System.out.println("Employees sorted by salary in descending order:");
            for (int i = 0; i < employees.length; i++) {
                for (int j = i + 1; j < employees.length; j++) {
                    if (employees[i].getSalary() < employees[j].getSalary()) {
                        Employee temp = employees[i];
                        employees[i] = employees[j];
                        employees[j] = temp;
                    }
                }
                System.out.println(employees[i].getName() + " - " + employees[i].getSalary());
            }
        }
}

