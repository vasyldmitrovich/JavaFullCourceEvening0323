package com.softserve.edu08.pt;

public class PracticalTask {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department("Name");
        Department.Address address = department.new Address("City", "Street", 1);
        department.setAddress(address);
        Department department1 = department.clone();
        department1.getAddress().setCity("Ivano-Frankivsk");
        System.out.println(department);
        System.out.println(department1);
    }
}
