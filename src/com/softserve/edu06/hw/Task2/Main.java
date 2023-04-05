package com.softserve.edu06.hw.Task2;

public class Main {
    public static void main(String[] args) {

        Developer developer = new Developer("Bozhen", 18, 400, "Java");
        Employee employee = new Employee("Dima", 48,6700);
        System.out.println(employee.report());
        System.out.println(developer.report());

    }
}
