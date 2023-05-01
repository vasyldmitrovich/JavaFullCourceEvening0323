package com.softserve.edu07.hw.Hw_7_1;

public abstract class Employee {
    private String employeeId;
    private String name;

    public Employee(String employeeId,String name){
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public String getName(){
        return name;
    }
    public abstract double calculatePay();


}
