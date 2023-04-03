package com.softserve.edu05.pt;

public class Employee {
    private String Name;
    private int DepartmentNumber;
    private int Salary;

    public Employee() {

    }

    public Employee(String Name, int DepartmentNumber, int Salary) {
        this.Name = Name;
        this.DepartmentNumber = DepartmentNumber;
        this.Salary = Salary;
    }

    public String getName() {
        return Name;
    }

    public int getDepartmentNumber() {
        return DepartmentNumber;
    }

    public int getSalary() {
        return Salary;
    }

}
