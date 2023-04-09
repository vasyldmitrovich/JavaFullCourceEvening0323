package com.softserve.edu06.hw.employees;

public class EmployeesApp {

    public static void main(String[] args) {
        Employee employee = new Employee("Olya", 30, 3500.0);
        Developer developer = new Developer("Olga", 38, 5000.0, "Java Developer");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
