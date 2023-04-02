package com.softserve.edu06.hw06.hw2;

public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Mark", 30, 41000);
        Developer developer1 = new Developer("Nick", 32, 60000, "Middle");
        System.out.println(employee1.report());
        System.out.println(developer1.report());
    }
}
