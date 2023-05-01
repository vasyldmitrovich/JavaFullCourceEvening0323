package com.softserve.edu07.hw.hw1;

import java.util.Arrays;
import java.util.Comparator;

public class App {
	public static void main(String[] args) {
		//Too mach code there, move all this object in some method, and there call this method
		SalariedEmployee salariedEmployee1 =
				new SalariedEmployee(100, "John Smith", "SS234567", 100000);
		SalariedEmployee salariedEmployee2 =
				new SalariedEmployee(101, "Sam Johnson", "SS567654", 80000);
		SalariedEmployee salariedEmployee3 =
				new SalariedEmployee(102, "Tom Hollad", "SS873456", 60000);
		ContractEmployee contractEmployee1 =
				new ContractEmployee(103, "Sara Conor", "ID546787", 3000, 40);
		ContractEmployee contractEmployee2 =
				new ContractEmployee(104, "Anna Wintour", "ID567432", 3500, 40);
		ContractEmployee contractEmployee3 =
				new ContractEmployee(105, "Emma Stone", "ID985643", 2500, 40);
		Employee[] employees = new Employee[]{salariedEmployee1, salariedEmployee2,
				salariedEmployee3, contractEmployee1, contractEmployee2, contractEmployee3};
		//didn't want to use ArrayList, so I used Arrays.sort with Comparator
		//Ok good, but put this code to some method, and call this method there
		Arrays.sort(employees, new Comparator<Employee>() { // don't want to use lambda yet
			@Override
			public int compare(Employee o1, Employee o2) {
				if (o1 instanceof SalariedEmployee && o2 instanceof SalariedEmployee) {
					return Integer.compare(((SalariedEmployee) o2).calculatePay(), ((SalariedEmployee) o1).calculatePay());
				}
				if (o1 instanceof ContractEmployee && o2 instanceof SalariedEmployee) {
					return Integer.compare(((SalariedEmployee) o2).calculatePay(), ((ContractEmployee) o1).calculatePay());
				}
				if (o1 instanceof ContractEmployee && o2 instanceof ContractEmployee) {
					return Integer.compare(((ContractEmployee) o2).calculatePay(), ((ContractEmployee) o1).calculatePay());
				}
				return Integer.compare(((ContractEmployee) o2).calculatePay(), ((SalariedEmployee) o1).calculatePay());
			}
		});
		for (Employee e : employees) {
			System.out.println(e);
		}
	}
}
