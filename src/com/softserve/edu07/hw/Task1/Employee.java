package com.softserve.edu07.hw.Task1;

import java.util.Comparator;

public abstract class Employee implements Payment{
    private String employeeId;

    public Employee(){
    }
    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                '}';
    }

    public static class BySalary implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (-o1.calculatePay() + o2.calculatePay());
        }
    }

}
