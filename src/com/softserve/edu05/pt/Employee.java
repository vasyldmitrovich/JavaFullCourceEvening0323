package com.softserve.edu05.pt;

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
		Employee[] employee = new Employee[length];
		int count = 0;
		for (Employee e : employees) {
			if (e.departmentNumber == department) {
				employee[count] = e;
				count++;
			}
		}
		return employee;
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
		Employee temp;
		for (int i = 0; i < employees.length; i++) {
			for (int j = i+1; j < employees.length; j++) {
				if (employees[i].getSalary() < employees[j].getSalary()) {
					temp = employees[i];
					employees[i] = employees[j];
					employees[j] = temp;
				}
			}
		}
		return employees;
	}
	
	
}
