package com.softserve.edu04.pt;

import java.util.Scanner;

public class Helper {
	public int inputIntReader(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		return scanner.nextInt();
	}
	
	public String inputStringReader(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		return scanner.nextLine();
	}
	
	public Product getMostExpensiveProduct(Product... products) {
		Product product = null;
		double max = 0;
		for (Product p : products) {
			if (p.getPrice() > max) {
				max = p.getPrice();
				product = p;
			}
		}
		return product;
	}
	
	public Product getBiggestQuantityProduct(Product... products) {
		Product product = null;
		int max = 0;
		for (Product p : products) {
			if (p.getQuantity() > max) {
				max = p.getQuantity();
				product = p;
			}
		}
		return  product;
	}
}
