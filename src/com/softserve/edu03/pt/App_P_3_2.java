package com.softserve.edu03.pt;

/*
Create class called Employee that should consist of:
        • three private fields: name, rate and hours;
        • a static field called totalSum
        • properties to access these fields;
        • a default constructor and two constructors with parameters;
        • Methods:
        o getSalary() - to calculate the salary of an employee (formula rate * hours);
        o toString() - to output information about the employee;
        o getBonuses() – to calculate 10% from salary.
        In the main() method create 3 objects of type Employee, input information about them.
        Display the total salary of all employees to the console.
*/
public class App_P_3_2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ivan", 25, 20);
        Employee e2 = new Employee("Sam", 35, 40);
        Employee e3 = new Employee("Tom", 74, 55);
        System.out.println("Total salary is ---> "+ (e1.getSalary() + e2.getSalary() + e3.getSalary()));


    }
}
