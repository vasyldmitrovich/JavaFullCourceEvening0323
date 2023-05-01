package com.softserve.edu05.pt;

public class Demo {
	public static void main(String[] args) {
		//Too big main method, separate tasks to methods
		Utils utils = new Utils();
		//pt1.1
		ArrayPractice arrayPractice = new ArrayPractice();
		String[] stringArr = {"sort", "find", "best"};
		System.out.print("1.1. We have a String array: ");
		System.out.print(utils.getStringOfStringArray(stringArr));
		System.out.print("\nResult of sorting it: ");
		System.out.print(utils.getStringOfStringArray(arrayPractice.stringArraySorter(stringArr)));
		//pt1.2
		int[] intArrayOfFive = {6, 7, 9, 13, 7};
		System.out.print("\n1.2. We have an array of numbers: ");
		System.out.print(utils.getStringOfIntArray(intArrayOfFive));
		System.out.print("\nThe average value is: ");
		System.out.print(arrayPractice.getAverageOfIntArrayValues(intArrayOfFive));
		//pt1.3
		String input = utils.inputStringReader("\n1.3. Enter any value, int or Staring, " +
				"to check if it's in any of those two arrays");
		System.out.println("Result of check is: " +
				arrayPractice.isElementPresentInOneOfTwoArrays(stringArr, intArrayOfFive, input));
		//pt2
		PrimeNumber primeNumber = new PrimeNumber();
		int num = utils.inputIntReader("\n2. Enter any positive number to check if it's prime: ");
		System.out.println(primeNumber.isPrimeNumber(num));
		//pt3
		System.out.print("\n3. We have a random generated int array: ");
		RandomIntArray randomIntArray = new RandomIntArray();
		int[] intArrayOfTen = randomIntArray.getTenRandomIntArray();
		System.out.print(utils.getStringOfIntArray(intArrayOfTen));
		System.out.print("\nThe biggest number in the array is: " + randomIntArray.getMaxValue(intArrayOfTen));
		System.out.print("\nThe sum of all positive numbers is: " + randomIntArray.getSumOfPositiveNumbers(intArrayOfTen));
		System.out.print("\nCount of all negative numbers is: " + randomIntArray.countNegativeNumbers(intArrayOfTen));
		System.out.print("\nResult of check between positive and negative numbers count is: \n");
		System.out.print(randomIntArray.negativePositiveValuesBalance(intArrayOfTen));
		//pt4
		Employee employee1 = new Employee("Nata", 3, 200000);
		Employee employee2 = new Employee("Jane", 6, 60000);
		Employee employee3 = new Employee("John", 3, 100000);
		Employee employee4 = new Employee("Frank", 6, 80000);
		Employee employee5 = new Employee("Anna", 5, 20000);
		System.out.print("\n4. We have 5 employees: " + employee1.getName() + ", " +  employee2.getName() +
				", " + employee3.getName() + ", " + employee4.getName() + " and " + employee5.getName() + ".");
		System.out.print("\nThere are three departments: 3, 5 and 6.");
		int depNum = utils.inputIntReader("\nEnter correct department number: ");
		System.out.print("At this department work: ");
		Employee[] allEmployees = new Employee[]{employee1, employee2, employee3, employee4, employee5};
		Employee[] employees = employee1.getAllEmployeesFromCurrentDepartment(allEmployees, depNum);
		for (Employee e : employees) {
			System.out.print("\n" + e.toString());
		}
		System.out.print("\nList of all workers in descending order by salary field:");
		allEmployees = employee1.getAllInDescendingOrderBySalaryField(allEmployees);
		for (Employee e : allEmployees) {
			System.out.print("\n" + e.toString());
		}
	}
}
