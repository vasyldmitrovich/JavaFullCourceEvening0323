package com.softserve.edu04.pt.Task2;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of day");
        System.out.println(Days.findDay(scanner.nextInt()));
    }
}
