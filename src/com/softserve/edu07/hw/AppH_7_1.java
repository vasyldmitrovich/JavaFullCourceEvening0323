package com.softserve.edu07.hw;

import java.util.Arrays;
import java.util.Comparator;

public class AppH_7_1 {
    public static void main(String[] args){
        Employee[] employees = {
                new SalariedEmployee("E001 Sam", "111-11-1111", 5000),
                new ContractEmployee("E002 Tom", "222-22-2222", 20, 160),
                new SalariedEmployee("E003 Ivan", "333-33-3333", 6000),
                new ContractEmployee("E004 Max", "444-44-4444", 30, 120),
                new ContractEmployee("E005 Joseph", "555-55-5555", 25, 140)
        };
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return Double.compare(emp2.calculatePay(), emp1.calculatePay());
            }
        });
        for (Employee emp : employees) {
            System.out.println(emp.getEmployeeld() + ": " + emp.calculatePay());
        }


    }
}
