package com.softserve.edu07.hw.hw2;

public class App {
	public static void main(String[] args) {
		Liner liner = new Liner(3, 300);
		liner.isSailing();
		Boat boat = new Boat(3000, 200);
		boat.isSailing();
		Plane plane = new Plane(1000, 320);
		plane.fly();
		Helicopter helicopter = new Helicopter(1000, 30000, 10);
		helicopter.fly();
		Bus bus = new Bus("to school", 40);
		bus.drive();
		Car car = new Car("pickup", 6);
		car.drive();
		Motorcycle motorcycle = new Motorcycle(120, 2);
		motorcycle.drive();
		Vehicle[] vehicles = new Vehicle[]{liner, boat, plane, helicopter, bus, car, motorcycle};
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
		plane.lend();
		helicopter.lend();
	}
}
