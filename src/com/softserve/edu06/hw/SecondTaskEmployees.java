package com.softserve.edu06.hw;

public class SecondTaskEmployees {
    public static void main(String[] args) {
        Employee employee = new Employee("Mykola", 25, 25000.00);
        Developer developer = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
