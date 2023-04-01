package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Comparator;

public class Employee {
	private String name;
	private int departmentNumber;
	private int salary;
	
	public Employee() {
	}
	
	public Employee(String name, int departmentNumber, int salary) {
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee " + name + " is from department " + departmentNumber + " with salary: " + salary;
	}
	
	public Employee[] getAllEmployeesFromCurrentDepartment(Employee[] employees, int department) {
		int length = getQuantityOfEmployeesAtCurrentDepartment(employees, department);
		Employee[] empl = new Employee[length];
		int count = 0;
		for (Employee e : employees) {
			if (e.departmentNumber == department) {
				empl[count] = e;
				count++;
			}
		}
		return empl;
	}
	
	public int getQuantityOfEmployeesAtCurrentDepartment(Employee[] employees, int department) {
		int quantity = 0;
		for (Employee e : employees) {
			if (e.departmentNumber == department) {
				quantity++;
			}
		}
		return quantity;
	}
	
	public Employee[] getAllInDescendingOrderBySalaryField(Employee[] employees) {
		Arrays.sort(employees, new Comparator<>() { //don't want to replace it by lambda as Sonar suggests
			@Override
			public int compare(Employee e1, Employee e2) {
				return Integer.compare(e2.salary, e1.salary);
			}
		});
		return employees;
	}
}
