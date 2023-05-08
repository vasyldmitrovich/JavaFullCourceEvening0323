package com.softserve.edu07.hw.homework1;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeApp {
    public static void main(String[] args) {
        //You can create some method, this method return array Employee and set in this variable calling method
        Employee[] employees = {
                new SalariedEmployee("1", "Olga", 3400, "123456"),
                new SalariedEmployee("2", "Lola", 2300, "098765"),
                new ContractEmployee("3", "Valya", 30, 120, "234567"),
                new ContractEmployee("4", "Anna", 20, 110, "345678"),
                new SalariedEmployee("5", "Katya", 1300, "98765"),
                new ContractEmployee("6", "Alex", 40, 99, "7563478")
        };

        Arrays.sort(employees, (e1, e2) -> {
            if (e1 instanceof SalariedEmployee && e2 instanceof SalariedEmployee)
                return Integer.compare(((SalariedEmployee) e1).calculatePay(), ((SalariedEmployee) e2).calculatePay());
            else if (e1 instanceof ContractEmployee && e2 instanceof ContractEmployee)
                return Integer.compare(((ContractEmployee) e1).calculatePay(), ((ContractEmployee) e2).calculatePay());
            else if (e1 instanceof SalariedEmployee && e2 instanceof ContractEmployee)
                return Integer.compare(((SalariedEmployee) e1).calculatePay(), ((ContractEmployee) e2).calculatePay());
            else
                return Integer.compare(((ContractEmployee) e1).calculatePay(), ((SalariedEmployee) e2).calculatePay());
        });

        for (Employee e: employees) {
            e.print();
        }
    }
}
