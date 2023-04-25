package com.softserve.edu07.hw;

public abstract class Employee implements Comparable{
    private String name;
    private double averageMonthlySalary;

    public Employee(){};

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    public void setAverageMonthlySalary(double averageMonthlySalary) {
        this.averageMonthlySalary = averageMonthlySalary;
    }

    @Override
    public String toString(){
        return null;
    }

    @Override
    public int compareTo(Object o) {
        Employee worker = (Employee) o;
        return (-1 * Double.compare(averageMonthlySalary,worker.averageMonthlySalary));
    }
}
