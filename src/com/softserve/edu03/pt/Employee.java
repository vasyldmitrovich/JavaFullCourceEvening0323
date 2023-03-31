package com.softserve.edu03.pt;

public class Employee {
    private String Name;
    private int Rate;
    private int Hours;


    Employee() {

    }

    public Employee(String name, int rate, int hours) {
        Name = name;
        Rate = rate;
        Hours = hours;

    }

    public String getName() {
        return Name;
    }

    public int getRate() {
        return Rate;
    }

    public int getHours() {
        return Hours;
    }


    public int getSalary() {
        int Salary = getHours() * getRate();
        System.out.println("The Salary is " + getHours() * getRate());
        return Salary;
    }

    public void output() {
        System.out.println("Name: " + Name + " Rate: " + Rate + " Hours: " + Hours + " Salary: " + (getHours() * getRate()));

    }

    public void Bonus() {
        System.out.println("Bonus: " + ((getHours() * getRate()) / 10));

    }

}
