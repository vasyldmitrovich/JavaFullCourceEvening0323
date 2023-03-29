package com.softserve.edu04.hw04.hw4;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of students of the next faculty");
        Faculty faculty1 = new Faculty(scanner.nextInt(), CurrentSeason.WINTER);
        System.out.println(faculty1);
    }
}
