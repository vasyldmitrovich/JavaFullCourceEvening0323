package com.softserve.apps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of task --> ");
        int selectTask = sc.nextInt();
        switch (selectTask){
            case 3:
               Task3.print();
               break;
            case 6:
                Task6.print();
                break;
            case 7:
                Task7.print();
                break;
            default:
                System.out.println("You enter wrong data !!");
        }

    }
}
