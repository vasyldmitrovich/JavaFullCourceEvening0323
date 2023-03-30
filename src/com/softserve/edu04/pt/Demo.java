package com.softserve.edu04.pt;

public class Demo {
	public static void main(String[] args) {
		Helper helper = new Helper();
		//pt1
		OddNumberCounter oddNumberCounter = new OddNumberCounter();
		int num1 = helper.inputIntReader("Input first number");
		int num2 = helper.inputIntReader("Input second number");
		int num3 = helper.inputIntReader("Input third number");
		System.out.println("Quantity of odd numbers is " + oddNumberCounter.oddNumCount(num1, num2, num3));
		//pt2
		DayOfWeekName dayOfWeekName = DayOfWeekName.MONDAY;
		int numOfWeekDay = helper.inputIntReader("Input number of the day of the week ");
		System.out.println("Name of this day is - " + dayOfWeekName.getNameOfWeekDay(numOfWeekDay));
		//pt3
		Continents continents = Continents.ASIA;
		String country = helper.inputStringReader("Enter country name ");
		if (country.equals("antarctica")) {
			System.out.println(continents.getContinentByCountry(country));
		}
		System.out.println("This country is situated on " + continents.getContinentByCountry(country) + " continent.");
		//pt4
		//TODO would be interesting to make it print several (equal) max values
		Product pen = new Product("Pen", 4.5, 6);
		Product pencil = new Product("Pencil", 3.0, 5);
		Product notebook = new Product("Notebook", 20.5, 2);
		Product eraser = new Product("Eraser", 2.5, 1);
		Product theMostExpensive = helper.getMostExpensiveProduct(pen, pencil, notebook, eraser);
		System.out.println("The most expensive item is: " + theMostExpensive.getName() + ", it's quantity is: " + theMostExpensive.getQuantity());
		Product biggestQuantity = helper.getBiggestQuantityProduct(pen, pencil, notebook, eraser);
		System.out.println(biggestQuantity.getName() + " has the biggest quantity");
	}
}
