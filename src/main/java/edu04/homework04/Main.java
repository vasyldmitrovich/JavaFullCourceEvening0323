package edu04.homework04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of students of the next faculty");
        Faculty faculty1 = new Faculty(scanner.nextInt(), CurrentSeason.WINTER);
        System.out.println(faculty1);
    }
}
