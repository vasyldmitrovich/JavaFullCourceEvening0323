package com.softserve.edu04.practic.taskFour;

public class Employee {
    private String name;
    private int department_number;
    private double salary;

    public Employee(String name, int department_number) {
        this.name = name;
        this.department_number = department_number;
        salary = 5000;
    }

    public Employee() {
    }

    public Employee(String name, int department_number, double salary) {
        this.name = name;
        this.department_number = department_number;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;

        if (getDepartment_number() != employee.getDepartment_number()) return false;
        return getName().equals(employee.getName());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getDepartment_number();
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department_number=" + department_number +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment_number() {
        return department_number;
    }

    public void setDepartment_number(int department_number) {
        this.department_number = department_number;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
