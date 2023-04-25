package com.softserve.edu07.hw;

import java.util.Arrays;

public class FirstTaskSalaryCalculator {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new ContractEmployee("Ahmed","827193456",85.43,15);
        employees[1] = new SalariedEmployee("Lui","OI42398",25800.50);
        employees[2] = new SalariedEmployee("Hilda","AD15789",33000.00);
        employees[3] = new ContractEmployee("Nick","798465132",100.38,20);

        Arrays.sort(employees);
        for(Employee employee: employees){
            System.out.println(employee);
        }
    }
}
