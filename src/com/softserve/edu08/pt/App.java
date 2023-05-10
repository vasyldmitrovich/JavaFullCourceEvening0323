package com.softserve.edu08.pt;

public class App {
	public static void main(String[] args) throws CloneNotSupportedException {
		Department department = new Department("Marketing", "Kyiv", "Bratyslavska", 32);
		Department departmentClone = (Department) department.clone();
		departmentClone.getAddress().setCity("Dnipro");
		System.out.println(department);
		System.out.println(departmentClone);
	}
}
