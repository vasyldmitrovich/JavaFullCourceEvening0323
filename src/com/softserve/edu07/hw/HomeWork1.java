package com.softserve.edu07.hw;

import com.softserve.edu06.hw.*;

import java.util.*;

public class HomeWork1 {
    public static void main(String[] args) {
        Employee employees[] = new Employee[4];
        employees[0] = new SalariedEmployee("ID 100", "SSN 100-100", 2000.0);
        employees[1] = new SalariedEmployee("ID 110", "SSN 110-110", 3000.0);
        employees[2] = new ContractEmployee("ID 200", 20.0, 50);
        employees[3] = new ContractEmployee("ID 220", 30.0, 40);

        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                Double salary1 = e1.calculatePay();
                Double salary2 = e2.calculatePay();
                return salary2.compareTo(salary1);
            }
        });

        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEmployeeId() + ". Monthly salary: " + employee.calculatePay());
        }
    }
}
