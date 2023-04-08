package com.softserve.edu06.hw;

public class HomeWork2 {
    public static void main(String[] args) {
        Employee employee = new Employee("Dima", 36, 8000);
        Developer developer = new Developer("Alex", 35, 5000);
        System.out.println("Employee " + employee.report());
        System.out.println("Developer " + developer.report());
    }
}
