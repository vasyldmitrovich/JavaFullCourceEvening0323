package com.softserve.edu05.pt;

import java.lang.reflect.Array;
import java.util.*;

public class PracticalTask4 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alex", 1, 100));
        employees.add(new Employee("Dima", 2, 200));
        employees.add(new Employee("Vitaliy", 3, 300));
        employees.add(new Employee("Oleg", 4, 400));
        employees.add(new Employee("Fedir", 5, 500));

        System.out.print("Enter the number of department: ");
        Scanner scan = new Scanner(System.in);
        int depNum = scan.nextInt();

        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() == depNum) {
                System.out.println("Employee of this department is: " + employee.getName());
            }
        }

        employees.sort((s1, s2) -> Double.compare(s2.getSalary(), s1.getSalary()));
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " " + employee.getSalary());
        }
    }
}
