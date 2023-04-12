package com.softserve.edu06.hw;

public class Employee {
    private String name;
    private int age;
    private  double salary;
    public Employee(String name,int age, double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public int getage() {
        return age;
    }
    public String getname() {
        return name;
    }
    public double getsalary() {return salary;
    }

    // Setter
    public void setage(int age) {
        this.age = age;

    }
    public String report(){
        return String.format("Name: "+name+" Age: -"+age+ " Salary: - "+salary);
    }


}
