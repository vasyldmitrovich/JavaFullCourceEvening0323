package com.softserve.edu03.pt.Task2;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalSum;

    //constructors
    public Employee() {
        name = "Default name";
        rate = 0;
        hours = 0;
    }

    public Employee(String name) {
        this.name = name;
        rate = 0;
        hours = 0;
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
        hours = 0;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    //methods
    // Each time when you wrote meths or make some changes in class do Reformat code
    public static int getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return rate * hours * 0.1;
    }

    @Override
    public String toString() {
        return "Employee [Name-" + name
                + "; Rate-" + rate
                + "; Hours-" + hours + "]";
    }
}

