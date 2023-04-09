package com.softserve.edu07.hw.homework1;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("1", "Olga", 3400, "123456"),
                new SalariedEmployee("2", "Lola", 2300, "098765"),
                new ContractEmployee("3", "Valya", 30, 120, "234567"),
                new ContractEmployee("4", "Anna", 20, 110, "345678")
        };

        
    }
}
