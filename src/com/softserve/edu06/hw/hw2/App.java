package com.softserve.edu06.hw.hw2;

public class App {
	public static void main(String[] args) {
		Employee employee = new Employee("Nata", 30, 10000);
		Developer developer = new Developer("Jane", 40, "junior Java developer", 60000);
		System.out.println(employee.report());
		System.out.println(developer.report());
	}
}
