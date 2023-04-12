/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.edu06.hw;

/**
 * @author rgonchar
 */
public class Employee {
    protected String name;
    protected int age;
    protected double salary;

    public Employee() {
        this.name = "";
        this.age = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d," + "Salary: \u20B4 %.2f.", name, age, salary);
    }

}
