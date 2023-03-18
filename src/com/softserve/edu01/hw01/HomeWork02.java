package edu01.hw;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {

        Scanner inputPersonalDate = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = inputPersonalDate.nextLine();

        System.out.println("Where do you live, " + name + "?");
        String address = inputPersonalDate.nextLine();
        inputPersonalDate.close();

        System.out.println(name + ", you live in the city of " + address);
    }
}
