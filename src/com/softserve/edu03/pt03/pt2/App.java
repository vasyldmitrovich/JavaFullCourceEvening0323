package com.softserve.edu03.pt03.pt2;

public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", 100, 192);
        Employee employee3 = new Employee("Pavlo", 110, 150);
        Employee employee2 = new Employee("Maria", 90, 195);
        Methods.toString(employee1);
        Methods.toString(employee2);
        Methods.toString(employee3);
        System.out.print("Total salary ");
        System.out.println((Methods.getSalary(employee1) + Methods.getSalary(employee2) + Methods.getSalary(employee3)));

    }
}
