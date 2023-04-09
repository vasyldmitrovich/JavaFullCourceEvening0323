package com.softserve.edu08.pt;

public class DepartmentApp {

    public static void main(String[] args) throws CloneNotSupportedException {
        Department department1 = new Department("Department1", new Department.Address("Dnipro", "Yavornitskogo", 54));
        System.out.println("Created departments: ");
        System.out.println(department1);
        Department department2 = (Department) department1.clone();
        System.out.println(department2);

        System.out.println("Changed departments: ");
        department2.getAddress().setCity("Kyiv");
        System.out.println(department1);
        System.out.println(department2);
    }
}
