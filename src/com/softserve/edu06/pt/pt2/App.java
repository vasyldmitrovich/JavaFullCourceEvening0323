package com.softserve.edu06.pt.pt2;

public class App {
	public static void main(String[] args) {
		Truck truck1 = new Truck("VW", 150, 2000);
		Truck truck2 = new Truck("Volvo", 155, 2010);
		Sedan sedan1 = new Sedan("BMW", 200, 2015);
		Sedan sedan2 = new Sedan("Mazda", 200, 2005);
		Car[] cars = new Car[]{truck1, truck2, sedan1, sedan2};
		for (Car car : cars) {
			//There call method run and stop
			System.out.println(car);
		}
		
	}
}
