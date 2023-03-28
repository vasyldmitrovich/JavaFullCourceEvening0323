package com.softserve.edu01.pt;

public class Employee {
    private String name;
    private double rate;
    private int hours;
    private static double totalSum;

    public Employee() {
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
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
        return getSalary() * 0.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() +
                '}';
    }

    public static double getTotalSum() {
        return totalSum;
    }

    /*There you have access to variable totalSum, and can use this.totalSum=   , do not use Employee.totalSum*/
    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

    /*Please move main method to another class for example to class App*/
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 15.0, 40);
        Employee employee2 = new Employee("Jane Smith", 20.0, 35);
        Employee employee3 = new Employee("Bob Johnson", 25.0, 45);

        setTotalSum(employee1.getSalary() + employee2.getSalary() + employee3.getSalary());

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println("Total Salary: " + getTotalSum());
    }
}
