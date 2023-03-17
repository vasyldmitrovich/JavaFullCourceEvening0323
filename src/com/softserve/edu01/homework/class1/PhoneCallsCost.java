package com.softserve.edu01.homework.class1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class PhoneCallsCost {
	
	public BigDecimal callCostCalculation(BigDecimal costPerMin, int minutes, int seconds) {
		BigDecimal costPerSec = costPerMin.divide(BigDecimal.valueOf(60), 5, RoundingMode.HALF_EVEN);
		if (minutes == 0) {
			return costPerSec.multiply(BigDecimal.valueOf(seconds));
		}
		BigDecimal minutesCost = costPerMin.multiply(BigDecimal.valueOf(minutes));
		BigDecimal secondsCost = costPerSec.multiply(BigDecimal.valueOf(seconds));
		return minutesCost.add(secondsCost);
	}
	
	public static void main(String[] args) {
		PhoneCallsCost phoneCallsCost = new PhoneCallsCost();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter cost per minute of first call in format 1.50 or 0.50 or 5");
		BigDecimal costString1 = new BigDecimal(scanner.nextLine());
		BigDecimal costPerMin1 = costString1.setScale(5, RoundingMode.HALF_EVEN);
		System.out.println("Enter minutes and seconds of first call in format 2 30 or 0 30 or 5 0:");
		int minutes1 = scanner.nextInt();
		int seconds1 = scanner.nextInt();
		scanner.nextLine();
		BigDecimal callCost1 = phoneCallsCost.callCostCalculation(costPerMin1, minutes1, seconds1);
		
		System.out.println("Enter cost per minute of second call in format 1.50 or 0.50 or 5");
		BigDecimal costString2 = new BigDecimal(scanner.nextLine());
		BigDecimal costPerMin2 = costString2.setScale(2, RoundingMode.HALF_EVEN);
		System.out.println("Enter minutes and seconds of second call in format 2 30 or 0 30 or 5 0:");
		int minutes2 = scanner.nextInt();
		int seconds2 = scanner.nextInt();
		scanner.nextLine();
		BigDecimal callCost2 = phoneCallsCost.callCostCalculation(costPerMin2, minutes2, seconds2);
		
		System.out.println("Enter cost per minute of third call in format 1.50 or 0.50 or 5");
		BigDecimal costString3 = new BigDecimal(scanner.nextLine());
		BigDecimal costPerMin3 = costString3.setScale(2, RoundingMode.HALF_EVEN);
		System.out.println("Enter minutes and seconds of third call in format 2 30 or 0 30 or 5 0:");
		int minutes3 = scanner.nextInt();
		int seconds3 = scanner.nextInt();
		scanner.close();
		BigDecimal callCost3 = phoneCallsCost.callCostCalculation(costPerMin3, minutes3, seconds3);
		
		System.out.println("First call cost is: " + NumberFormat.getCurrencyInstance().format(callCost1));
		System.out.println("Second call cost is: " + NumberFormat.getCurrencyInstance().format(callCost2));
		System.out.println("Third call cost is: " + NumberFormat.getCurrencyInstance().format(callCost3));
		BigDecimal totalCost = callCost1.add(callCost2).add(callCost3);
		System.out.println("All calls cost is: " + NumberFormat.getCurrencyInstance().format(totalCost));
	}
}
