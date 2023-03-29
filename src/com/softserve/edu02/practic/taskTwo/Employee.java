package com.softserve.edu02.practic.taskTwo;

public class Employee {
    private String name;
    private double rate;
    private int hours;
    private static double totalSum;

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

    public Employee() {
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public Employee(String name, int hours) {
        this.rate = 3.12;
        this.name = name;
        this.hours = hours;
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return ((rate * hours) * 10) / 100;
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
