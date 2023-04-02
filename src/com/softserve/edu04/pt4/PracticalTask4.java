package com.softserve.edu04.pt4;

import java.util.Scanner;

public class PracticalTask4 {
    public static void main(String[] args) {
        Product phones1 = new Product("Iphone", 500, 10);
        Product phones2 = new Product("Samsung", 400, 15);
        Product phones3 = new Product("Xiaomi", 200, 30);
        Product phones4 = new Product("Pixel", 300, 20);
        if (phones1.getPrice() > phones2.getPrice() && phones1.getPrice() > phones3.getPrice() && phones1.getPrice() > phones4.getPrice()) {
            System.out.println(phones1.getName() + " is expensive product.");
        }
        if (phones2.getPrice() > phones1.getPrice() && phones2.getPrice() > phones3.getPrice() && phones2.getPrice() > phones4.getPrice()) {
            System.out.println(phones2.getName() + " is expensive product.");
        }
        if (phones3.getPrice() > phones1.getPrice() && phones3.getPrice() > phones2.getPrice() && phones3.getPrice() > phones4.getPrice()) {
            System.out.println(phones3.getName() + " is expensive product.");
        }
        if (phones4.getPrice() > phones1.getPrice() && phones1.getPrice() > phones3.getPrice() && phones2.getPrice() > phones3.getPrice()) {
            System.out.println(phones4.getName() + " is expensive product.");
        }
        if (phones1.getQuantity() > phones2.getQuantity() && phones1.getQuantity() > phones3.getQuantity() && phones1.getQuantity() > phones4.getQuantity()) {
            System.out.println(phones1.getName() + " has the biggest quantity.");
        }
        if (phones2.getQuantity() > phones1.getQuantity() && phones2.getQuantity() > phones3.getQuantity() && phones2.getQuantity() > phones4.getQuantity()) {
            System.out.println(phones2.getName() + " has the biggest quantity.");
        }
        if (phones3.getQuantity() > phones1.getQuantity() && phones3.getQuantity() > phones2.getQuantity() && phones3.getQuantity() > phones4.getQuantity()) {
            System.out.println(phones3.getName() + " has the biggest quantity.");
        }
        if (phones4.getQuantity() > phones1.getQuantity() && phones4.getQuantity() > phones2.getQuantity() && phones4.getQuantity() > phones3.getQuantity()) {
            System.out.println(phones4.getName() + " has the biggest quantity.");
        }
    }
}
