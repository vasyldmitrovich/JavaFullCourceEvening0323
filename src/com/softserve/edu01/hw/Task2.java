package com.softserve.edu01.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where are you from, " + name + "?");
        String from = scanner.nextLine();
        System.out.println("Your name is " + name + " and you from " + from);
    }
}
