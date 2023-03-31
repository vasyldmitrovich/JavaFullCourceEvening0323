package com.softserve.edu05.homework.taskTwo;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Anton",20,5000);
        Developer developer = new Developer("Bob",25,25000,"Senior Java Developer");
        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
