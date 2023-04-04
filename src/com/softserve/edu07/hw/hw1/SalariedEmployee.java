package com.softserve.edu07.hw.hw1;

public class SalariedEmployee extends Employee implements Payment {
	private int id;
	private String name;
	private String socialSecurityNumber;
	private int fixedSalary;
	
	public SalariedEmployee() {
	}
	
	public SalariedEmployee(int id, String name, String socialSecurityNumber, int fixedSalary) {
		this.id = id;
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.fixedSalary = fixedSalary;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public int getFixedSalary() {
		return fixedSalary;
	}
	
	public void setFixedSalary(int fixedSalary) {
		this.fixedSalary = fixedSalary;
	}
	
	@Override
	public int calculatePay() {
		return fixedSalary;
	}
	
	@Override
	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", AMW=" + calculatePay();
	}
}
