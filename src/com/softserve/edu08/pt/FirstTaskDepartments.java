package com.softserve.edu08.pt;

public class FirstTaskDepartments {
    public static void main(String[] args) {
        Department department1 = new Department("IT", "Kalush", "Promyslova", 12);
        System.out.println(department1);
        try {
            Department department2 = (Department) department1.clone();
            department2.setCity("Ivano-Frankivsk");
            System.out.println(department2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
