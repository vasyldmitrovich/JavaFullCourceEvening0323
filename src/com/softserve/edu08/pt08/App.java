package com.softserve.edu08.pt08;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department1 = new Department("First department", new Department.Address("Dnipro", "Pobeda street", 121));
        Department department2 = (Department) department1.clone();
        System.out.println(department2);
        System.out.println(department1);
        System.out.println();
        department2.getAddress().setCity("Kyiv");
        System.out.println(department2);
    }
}
