package com.softserve.edu07.hw.hw1;

public class ContractEmployee extends Employee implements Payment {
	//Why you create field id in this class, you can use field id from Employee class
	//And in salaried class do the same
	private int id;
	private String name;
	private String federalTaxIdMember;
	private int hourRate;
	private int hourCount;
	
	public ContractEmployee() {
	}
	
	public ContractEmployee(int id, String name, String federalTaxIdMember, int hourRate, int hourCount) {
		this.id = id;
		this.name = name;
		this.federalTaxIdMember = federalTaxIdMember;
		this.hourRate = hourRate;
		this.hourCount = hourCount;
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
	
	public String getFederalTaxIdMember() {
		return federalTaxIdMember;
	}
	
	public void setFederalTaxIdMember(String federalTaxIdMember) {
		this.federalTaxIdMember = federalTaxIdMember;
	}
	
	public int getHourRate() {
		return hourRate;
	}
	
	public void setHourRate(int hourRate) {
		this.hourRate = hourRate;
	}
	
	public int getHourCount() {
		return hourCount;
	}
	
	public void setHourCount(int hourCount) {
		this.hourCount = hourCount;
	}
	
	@Override
	public int calculatePay() {
		return hourCount * hourRate;
	}
	
	@Override
	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", AMW=" + calculatePay();
	}
}
