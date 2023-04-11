package com.softserve.edu05.hm;
import java.util.Scanner;

public class HomeWorkFirstPoint{

        public static void main(String[] args) {
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // кількість днів у місяцях
            Scanner scanner = new Scanner(System.in);
            System.out.print("Write a number of month (1-12): ");
            int month = scanner.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("error number!");
            } else {
                int days = daysInMonth[month - 1];
                System.out.printf("The number of days in the month under the number -  "+ month+":  "+ days);
            }
        }
    }


