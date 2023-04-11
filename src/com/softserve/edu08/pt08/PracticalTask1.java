package com.softserve.edu08.pt08;

public class PracticalTask1 {
    public static void main(String[] args) {
        Department.Address address1 = new Department().new Address("City1", "Street1", 1);
        Department department1 = new Department("Department1", address1);
        Department.Address address2 = new Department().new Address("City2", "Street2", 2);
        Department department2 = new Department(department1);
        department2.setCity("City3");

        System.out.println("Department1: " + department1);
        System.out.println("Department2: " + department2);
    }
}
