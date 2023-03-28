package com.softserve.edu03.pt;

public class Employee {
	private String name;
	private int rate;
	private int hours;
	static int totalSum;
	
	public Employee() {
	}
	//task asked for three constructors, but I think this one is not needed
	/*This Constructor must write because maybe someone in future will use*/
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}
	
	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRate() {
		return rate;
	}
	
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	public int getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public int getSalary() {
		return rate * hours;
	}
	
	public int getBonuses(int salary) {
		return (int) (salary * 0.1);
	}
	
	@Override
	public String toString() {
		return "Employee[name=" + name + ", rate=" + rate + "]";
	}
	
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee("Petro", 25, 40);
		Employee employee3 = new Employee("Fedir", 30, 40);
		employee1.setName("Ivan");
		employee1.setRate(20);
		employee1.setHours(40);
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());
		totalSum = employee1.getSalary() + employee2.getSalary() + employee3.getSalary();
		System.out.println("The total salary of all workers is: " + totalSum);
		System.out.println("Bonus of employee " + employee1.name + " is: " + employee1.getBonuses(employee1.getSalary()));
	}
}
