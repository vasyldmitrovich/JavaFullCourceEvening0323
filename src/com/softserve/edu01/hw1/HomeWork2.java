package com.softserve.edu01.hw1;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = scan.nextLine();
        System.out.println("Where do you live, " + name + "?");
        String address = scan.nextLine();
        System.out.println("I live in " + address + ".");
        System.out.println("Your name is: " + name + ". You live in " + address + ".");
    }
}
