package com.softserve.edu03.pt;

class Employee {
    private String name;
    private int hours;
    private double rate;
    public static double totalSum = 0;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int hours, double rate) {
        this.name = name;
        this.hours = hours;
        this.rate = rate;
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

    public double getSalary() {
        return rate * hours;
    }

    public String toString() {
        double salary = getSalary();
        totalSum += salary;
        return "Name: " + name + ", salary: " + getSalary() + ", bonus: " + getBonuses(salary);
    }

    public double getBonuses(double salary) {
        return salary * 0.1;
    }
}
