package com.softserve.edu08.pt;

public class Pt_8_1 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Department department1 = new Department("Department 1", "Rivne", "Ryska", 123);

        System.out.println("Department 1: " + department1.getName() + " - " + department1.getAddress().getCity() +
                ", " + department1.getAddress().getStreet() + ", " + department1.getAddress().getBuilding());


        Department department2 = null;
        try {
            department2 = department1.clone();
            department2.getAddress().setCity("Kyiv");
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone Error");
        }
        System.out.println("Department 2: " + department2.getName() + " - " + department2.getAddress().getCity() +
                ", " + department2.getAddress().getStreet() + ", " + department2.getAddress().getBuilding());


    }
}