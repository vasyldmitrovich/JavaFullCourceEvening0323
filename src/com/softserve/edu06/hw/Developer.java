/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.edu06.hw;

/**
 * @author rgonchar
 */
public class Developer extends Employee {
    private String position;

    public Developer() {
        super();
        this.position = "";
    }

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s," + "Salary: \u20B4 %.2f.", name, age, position, salary);
    }

}
