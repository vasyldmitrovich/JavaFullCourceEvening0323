package com.softserve.edu05.pt;

public class Employee implements Comparable {
    private String name;
    private int departmentNumber;
    private double salary;

    public Employee(){}

    public Employee(String name, int departmentNumber, double salary){
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDepartmentNumber(int departmentNumber){
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getDepartmentNumber(){
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + "; department number: " + departmentNumber + "; salary: " + salary;
    }

    @Override
    public int compareTo(Object o) {
        Employee employee = (Employee) o;

        if(departmentNumber != employee.departmentNumber){
            return Integer.compare(departmentNumber, employee.departmentNumber);
        } else if(salary != employee.salary) {
            return -1 * Double.compare(salary, employee.salary);
        } else {
            return name.compareTo(employee.name);
        }
    }
}
