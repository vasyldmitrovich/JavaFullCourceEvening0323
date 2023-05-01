package com.softserve.edu06.hw.Hw_6_2;

public class Hw_6_2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Max", 18, 23000);
        System.out.println(e1.report());
        Developer d1 = new Developer("Taras", 32, 32735.35, "Average Java developer");
        System.out.println(d1.report());


    }
}
