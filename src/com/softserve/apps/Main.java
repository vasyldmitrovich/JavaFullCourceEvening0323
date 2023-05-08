package com.softserve.apps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of task --> ");
        int selectTask = sc.nextInt();
        switch (selectTask){
            case 1:
                Task1.Fibonachi();
                break;
            case 2:
                System.out.print("Enter a number: ");
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                Task2.print(number);
                break;
            case 3:
               Task3.print();
               break;
            case 4:
                Task4.Vowels();
                break;
            case 6:
                Task6.print();
                break;
            case 7:
                Task7.print();
                break;
            case 9:
                
                break;
            case 10:
                Task10.print();
                break;
            default:
                System.out.println("You enter wrong data !!");
        }

    }
}
