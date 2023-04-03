package com.softserve.edu05.hw;

import java.util.Scanner;

public class Hw_5_1_1 {
    public static void main(String[] args){

    Month();
    }


    public static void Month(){
        String[] month = {"January","February","March","April",
                "May","June","July","August","September","October","November","December"};
        String[] days = {"31","28/29","31","30","31","30","31","31","30","31","30","31"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of month(1-12): ");
        int input = sc.nextInt();
        System.out.println("It is "+month[input-1]+" and it`s "+days[input-1]+" days in it");

    }
}
