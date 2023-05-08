package com.softserve.edu03.pt3;

import java.util.Scanner;

public class PracticalTask2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Vitaliy");
        Employee emp3 = new Employee("Dima", 5, 10);
        Employee emp4 = new Employee("Oleg", 10, 15);
        Employee emp5 = new Employee("Alex", 15, 20);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println(emp5);
        System.out.println(emp3.getSalary());
        System.out.println(emp3.getBonuses());
        System.out.println(emp4.getSalary());
        System.out.println(emp4.getBonuses());
        System.out.println(emp5.getSalary());
        System.out.println(emp5.getBonuses());
        int totalResult = Employee.totalSum;
        System.out.println("Total salary: " + totalResult + ".");
    }
}
