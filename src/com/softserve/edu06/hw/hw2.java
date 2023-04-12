package com.softserve.edu06.hw;

public class hw2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee=new Employee("Oleh", 22,2000);
        Developer developer=new Developer("Andriy",27,2900,"HR");
        Employee employee1=new Developer("jan",20,5000,"SMM");
        System.out.println( employee1.report());


       System.out.println( employee.report());
        System.out.println( developer.report());
    }
}
