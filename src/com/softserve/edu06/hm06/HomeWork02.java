package com.softserve.edu06.hm06;

public class HomeWork02 {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 30, 25000.00);
        Developer developer = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }

}
