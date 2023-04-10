package com.softserve.edu05.pt;

public class Employee {
    private String Name;
    private int departmentNumber;
    private int Salary;

    Employee(){

    }
    Employee(String name, int DepartmentNumber, int salary){
        Name = name;
        departmentNumber = DepartmentNumber;
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public int getSalary() {
        return Salary;
    }
}
