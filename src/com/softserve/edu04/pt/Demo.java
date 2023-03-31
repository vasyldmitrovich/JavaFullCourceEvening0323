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
		System.out.println(); //added this for better readability when running the whole project
		//pt2
		DayOfWeekName dayOfWeekName = DayOfWeekName.MONDAY;
		int numOfWeekDay = helper.inputIntReader("Input number of the day of the week ");
		System.out.println("Name of this day is - " + dayOfWeekName.getNameOfWeekDay(numOfWeekDay));
		System.out.println();
		//pt3
		Continents continents = Continents.ASIA;
		String country = helper.inputStringReader("Enter country name ");
		if (country.equals("antarctica")) {
			System.out.println(continents.getContinentByCountry(country));
		}
		System.out.println("This country is situated on " + continents.getContinentByCountry(country) +
				" continent.");
		System.out.println();
		//pt4
		Product pen = new Product("Pen", 4.5, 5);
		Product pencil = new Product("Pencil", 3.0, 5);
		Product notebook = new Product("Notebook", 20.5, 2);
		Product eraser = new Product("Eraser", 2.5, 1);
		Product[] biggestQuantityProducts = Helper.getAllBiggestQuantityProducts(pen, pencil, notebook, eraser);
		System.out.println("pt4 \nwe have 4 products: " + pen.getName().toLowerCase() + ", " +
				pencil.getName().toLowerCase() + ", " + notebook.getName().toLowerCase() + " and " +
				eraser.getName().toLowerCase() + ".");
		for (Product p : biggestQuantityProducts) {
			System.out.println(p.getName() + " has the biggest quantity");
		}
		Product[] allMostExpensiveProducts = Helper.getAllMostExpensiveProducts(pen, pencil, notebook, eraser);
		for (Product p : allMostExpensiveProducts) {
			System.out.println("The most expensive item is: " + p.getName() + ", it's quantity is: " + p.getQuantity());
		}
	}
}
