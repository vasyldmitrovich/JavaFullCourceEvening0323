package com.softserve.edu03.pt;

public class Employee {
    /*Firstly must be field after that constructors and after that getters and setters and the last one should be another methods*/
    private String name;
    private int rate;
    private int hours;
    private static int totalSum;

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = totalSum + this.getSalary();
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

    int getSalary() {
        return (this.rate * this.hours);
    }

    float getBonuses() {
        return (0.1f * this.getSalary());
    }

    public static int getTotalSum() {
        return totalSum;
    }
}
