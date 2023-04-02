package com.softserve.edu03.pt3;

public class Employee {
    private String name;
    private int rate;
    private int hours;

    static int totalSum;

    public Employee(){
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary() + getBonuses();
    }

    public int getSalary(){
        return rate * hours;
    }

    public int getBonuses(){
        return getSalary()/10;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
