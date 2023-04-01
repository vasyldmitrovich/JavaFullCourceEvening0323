package com.softserve.edu04.pt;

import com.softserve.edu04.hw.Dog;

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
	
	public float inputFloatReader(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		return scanner.nextFloat();
	}
	//I think that such kind of methods should be in Product/Dog/... class, right?
	//in edu05 I did that way
	public static Product getMostExpensiveProduct(Product... products) {
		Product product = new Product();
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
		Product product = new Product();
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
	
	public boolean noNameRepeat(String... names) {
		for (int i = 0; i < names.length; i++) {
			for (int j = i+1; j < names.length; j++) {
				if (j!=i && names[j].equals(names[i])) {
					return false;
				}
			}
		}
		return true;
	}
	
	public Dog getOldest(Dog... dogs) {
		int maxAge = 0;
		Dog dog = new Dog();
		for (Dog d : dogs) {
			if (d.getAge() > maxAge) {
				maxAge = d.getAge();
				dog = d;
			}
		}
	return dog;
	}
}
