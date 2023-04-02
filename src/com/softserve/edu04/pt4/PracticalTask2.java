package com.softserve.edu04.pt4;

import com.softserve.edu03.pt3.Employee;

import java.util.Scanner;

public class PracticalTask2 {
    public static void main(String[] args) {
        System.out.print("Please enter the day of the week: ");
        Scanner scanDay = new Scanner(System.in);
        int dayOfWeek = scanDay.nextInt();
        if (dayOfWeek == 1) {
            System.out.println("Today is Monday.");
            System.out.println("Сьогодні Понеділок.");
        }
        if (dayOfWeek == 2) {
            System.out.println("Today is Thursday.");
            System.out.println("Сьогодні Вівторок.");
        }
        if (dayOfWeek == 3) {
            System.out.println("Today is Wednesday.");
            System.out.println("Сьогодні Середа.");
        }
        if (dayOfWeek == 4) {
            System.out.println("Today is Thursday.");
            System.out.println("Сьогодні Четвер.");
        }
        if (dayOfWeek == 5) {
            System.out.println("Today is Friday.");
            System.out.println("Сьогодні П'ятниця.");
        }
        if (dayOfWeek == 6) {
            System.out.println("Today is Saturday.");
            System.out.println("Сьогодні Субота.");
        }
        if (dayOfWeek == 7) {
            System.out.println("Today is Sunday.");
            System.out.println("Сьогодні Неділя.");
        }
    }
}
