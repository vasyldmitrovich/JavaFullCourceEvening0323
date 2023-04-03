package com.softserve.edu05.hw;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
	private Car car1;
	private Car car2;
	private Car car3;
	private Car car4;
	private Car[] allCars;
	private int existingYearOfProduction;
	private int notExistingYearOfProduction;
	
	@Before
	public void setUp() {
		car1 = new Car("Sport car", 2020, 5.0);
		car2 = new Car("Minivan", 1999, 3.5);
		car3 = new Car("Pickup", 2005, 4.0);
		car4 = new Car("Sedan", 2015, 2.0);
		allCars = new Car[]{car1, car2, car3, car4};
		existingYearOfProduction = 2020;
		notExistingYearOfProduction = 2023;
	}
	
	@Test
	public void testToStringShouldReturnCurrentString() {
		String expected = "Car type Sport car, year of production - 2020, engine capacity - 5.0";
		String actual = car1.toString();
		
		Assert.assertEquals(expected, actual);
	}
	//is this the right/expected or actual should be "Sport car"?
	@Test
	public void getTypeByCurrentYearShouldReturnCurrentType() {
		String expected = "Sport car";
		String actual = car1.getTypeByCurrentYear(existingYearOfProduction, allCars);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getTypeByCurrentYearShouldReturnMessage() {
		String expected = "There is no car";
		String actual = car1.getTypeByCurrentYear(notExistingYearOfProduction, allCars);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getSortedByYearOfProduction() {
		Car[] expected = new Car[]{car1, car4, car3, car2};
		Car[] actual = car1.getSortedByYearOfProduction(allCars);
		
		Assert.assertArrayEquals(expected, actual);
	}
}