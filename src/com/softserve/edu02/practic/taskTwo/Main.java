package com.softserve.edu02.practic.taskTwo;

public class Main {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Sanya", 3.55, 120);
        Employee employeeTwo = new Employee("Anton", 250);
        Employee employeeThree = new Employee("Evgen", 213);
        System.out.println("Total salary all employees with bonuses = " + ((employeeOne.getSalary() + employeeOne.getBonuses()) + (employeeTwo.getSalary() + employeeTwo.getBonuses()) + (employeeThree.getSalary() + employeeThree.getBonuses())));
        System.out.println("Total salary without bonuses = " + (employeeOne.getSalary() + employeeTwo.getSalary() + employeeThree.getSalary()));
    }
}
