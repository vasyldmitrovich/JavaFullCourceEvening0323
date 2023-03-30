package com.softserve.edu03.pt;

import javax.lang.model.element.Name;

/*
Create class called Employee that should consist of:
        • three private fields: name, rate and hours;
        • a static field called totalSum
        • properties to access these fields;
        • a default constructor and second constructors with parameters;
        • Methods:
        o getSalary() - to calculate the salary of an employee (formula rate * hours);
        o toString() - to output information about the employee;
        o getBonuses() – to calculate 10% from salary.
        In the main() method create 3 objects of type Employee, input information about them.
        Display the total salary of all employees to the console.
*/
public class Employee {
    private String Name;
    private int rate;
    private int hours;
    static  int totalSum;
    private float bonuses = 0.1f;
    Employee(){

    }
    Employee( String Name, int rate, int hours){
        this.Name = Name;
        this.rate = rate;
        this.hours = hours;
    }

    public int getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public  void output(){
        System.out.println("Name --> " + Name + "Rate --> " + rate + "Hours --> " + hours);
    }

    public  int getSalary(){
        int Salary = getRate()*getHours();
        System.out.println("Salary of this person is --> "+ Salary);
        return Salary;
    }
    public void getBonuses(){
        System.out.println("Bonuses for this person is --. "+(getRate()*getHours())*0.1);
    }

}
