package com.softserve.edu08.pt;

public class AppP_8_1 {
    public static void main(String[] args) {
        //Good
        Department.Address address = new Department.Address("Ternopil", "Valova", 11);
        Department department = new Department("Sales", address);

        System.out.println("Department name: " + department.getName());
        System.out.println("Department address: " + department.getAddress().getBuilding() + " " +
                department.getAddress().getStreet() + ", " + department.getAddress().getCity());

        Department department2 = null;
        try {
            department2 = department.clone();
            department2.getAddress().setCity("Lviv");
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone Error!!");
        }

        System.out.println("Department 2:");
        System.out.println("Name: " + department2.getName());
        System.out.println("Address: " + department2.getAddress().getBuilding() + " " +
                department2.getAddress().getStreet() + ", " + department2.getAddress().getCity());


    }
}
