package com.softserve.edu07.hw.Hw_7_1;

import java.util.ArrayList;
import java.util.List;

public class Hw_7_1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        //Ok
        // Add salaried employees
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("1", "Max", "111-11-1111", 4000.0);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("2", "Ivan", "222-22-2222", 5000.0);
        employees.add(salariedEmployee1);
        employees.add(salariedEmployee2);
        ContractEmployee contractEmployee1 = new ContractEmployee("3", "Vasyl", "333-33-3333", 20.0, 160);
        ContractEmployee contractEmployee2 = new ContractEmployee("4", "Ruslan", "444-44-4444", 25.0, 140);
        employees.add(contractEmployee1);
        employees.add(contractEmployee2);

        for (Employee employee : employees) {
            double averageMonthlyWage = employee.calculatePay();
            System.out.println("Employee ID: " + employee.getEmployeeId() + ", Name: " + employee.getName() + ", Average Monthly Wage: " + averageMonthlyWage);
        }
    }
}
