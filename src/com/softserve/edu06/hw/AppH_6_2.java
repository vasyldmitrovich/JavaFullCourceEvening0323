package com.softserve.edu06.hw;

public class AppH_6_2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 35, 45000.0);
        Developer d1 = new Developer("Taras", 32, 32735.35, "Tester");
        Employee e2 = new Employee("Sam", 18, 15000.0);
        Developer d2 = new Developer("Max", 22, 32735.35, "Java Developer");

        //You can use array Employee and there use loop, in loop call this method
        System.out.println(e1.report());
        System.out.println(d1.report());
        System.out.println(e2.report());
        System.out.println(d2.report());
    }
}

