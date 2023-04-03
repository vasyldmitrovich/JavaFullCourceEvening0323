package com.softserve.edu03.pt;

public class Demo {
	public static void main(String[] args) {
		//pt1
		int num1 = TotalAvg.getNumber("Enter first number: ");
		int num2 = TotalAvg.getNumber("Enter second number: ");
		int sum = TotalAvg.getTotal(num1, num2);
		String avg = TotalAvg.getAverage(num1, num2);
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
		System.out.println("The average of " + num1 + " and " + num2 + " is " + avg);
		//pt2
		System.out.println("2. We have three employees: ");
		Employee employee1 = new Employee();
		Employee employee2 = new Employee("Petro", 25, 40);
		Employee employee3 = new Employee("Fedir", 30, 40);
		employee1.setName("Ivan");
		employee1.setRate(20);
		employee1.setHours(40);
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());
		int totalSum = employee1.getSalary() + employee2.getSalary() + employee3.getSalary();
		System.out.println("The total salary of all workers is: " + totalSum);
		System.out.println("Bonus of employee " + employee1.getName() + " is: " +
				employee1.getBonuses(employee1.getSalary()));
	}
}
