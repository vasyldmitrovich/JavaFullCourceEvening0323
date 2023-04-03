package com.softserve.edu05.hw;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonthNumberOfDaysTest {
	private MonthNumberOfDays monthNumberOfDays;
	
	@Before
	public void setUp() {
		monthNumberOfDays = new MonthNumberOfDays();
	}
	
	@Test
	public void getDaysByMonthShouldReturnCurrantNumber() {
		int expected = monthNumberOfDays.getDaysByMonth(4);
		int actual = 30;
		
		Assert.assertEquals(expected, actual);
	}
}