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
	
	public static Product getMostExpensiveProduct(Product... products) {
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
	
	public static Product getBiggestQuantityProduct(Product... products) {
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
	
	public static Product[] getAllBiggestQuantityProducts(Product... products) {
		int counter = 0;
		Product[] pr1 = new Product[1];
		Product biggest = Helper.getBiggestQuantityProduct(products);
		for (Product p : products) {
			if (biggest.getQuantity() == p.getQuantity()) {
				counter++;
			}
		}
		if (counter == 1) {
			pr1[0] = biggest;
			return pr1;
		}
		Product[] prN = new Product[counter];
		int j = 0;
		for (Product product : products) {
			if (biggest.getQuantity() == product.getQuantity()) {
				prN[j] = product;
				j++;
			}
		}
		return prN;
	}
	
	public static Product[] getAllMostExpensiveProducts(Product... products) {
		int counter = 0;
		Product[] pr1 = new Product[1];
		Product biggest = Helper.getMostExpensiveProduct(products);
		for (Product p : products) {
			if (biggest.getPrice() == p.getPrice()) {
				counter++;
			}
		}
		if (counter == 1) {
			pr1[0] = biggest;
			return pr1;
		}
		Product[] prN = new Product[counter];
		int j = 0;
		for (Product product : products) {
			if (biggest.getPrice() == product.getPrice()) {
				prN[j] = product;
				j++;
			}
		}
		return prN;
	}
}
