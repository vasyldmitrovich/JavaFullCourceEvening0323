package com.softserve.edu05.pt;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {
	private Employee employee1;
	private Employee employee2;
	private Employee employee3;
	private Employee[] employees;
	
	@Before
	public void setUp() {
		employee1 = new Employee("Nata", 1, 100000);
		employee2 = new Employee("Jane", 2, 60000);
		employee3 = new Employee("John", 1, 200000);
		employees = new Employee[]{employee1, employee2, employee3};
	}
	
	@Test
	public void toStringShouldReturnCurrentString() {
		String expected = employee1.toString();
		String actual = "Employee Nata is from department 1 with salary: 100000";
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getAllEmployeesFromCurrentDepartmentShouldGetTwoEmployee() {
		Employee[] expected = employee1.getAllEmployeesFromCurrentDepartment(employees, 1);
		Employee[] actual = new Employee[]{employee1, employee3};
		
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void getAllEmployeesFromCurrentDepartmentShouldGetOneEmployee() {
		Employee[] expected = employee1.getAllEmployeesFromCurrentDepartment(employees, 2);
		Employee[] actual = new Employee[]{employee2};
		
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void getQuantityOfEmployeesAtCurrentDepartmentShouldReturnOne() {
		int expected = employee1.getQuantityOfEmployeesAtCurrentDepartment(employees, 2);
		int actual = 1;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getQuantityOfEmployeesAtCurrentDepartmentShouldReturnTwo() {
		int expected = employee1.getQuantityOfEmployeesAtCurrentDepartment(employees, 1);
		int actual = 2;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getAllInDescendingOrderBySalaryField() {
		Employee[] expected = employee1.getAllInDescendingOrderBySalaryField(employees);
		Employee[] actual = new Employee[]{employee3, employee1, employee2};
		
		Assert.assertArrayEquals(expected, actual);
	}
}