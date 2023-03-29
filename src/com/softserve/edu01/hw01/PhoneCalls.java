package com.softserve.edu01.hw01;

import java.util.Scanner;

public class PhoneCalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many cents 1 minute phone call from USA cost?");
        int usaPhoneCost = sc.nextInt();
        System.out.println("How many cents 1 minute phone call from China cost?");
        int chinaPhoneCost = sc.nextInt();
        System.out.println("How many cents 1 minute phone call from Australia cost?");
        int australiaPhoneCost = sc.nextInt();
        System.out.println("How many minutes were call from USA?");
        int usaMinutes = sc.nextInt();
        System.out.println("How many minutes were call from China?");
        int chinaMinutes = sc.nextInt();
        System.out.println("How many minutes were call from Australia?");
        int australiaMinutes = sc.nextInt();
        System.out.println("Phone call from USA cost: "+usaMinutes*usaPhoneCost);
        System.out.println("Phone call from China cost: "+chinaMinutes*chinaPhoneCost);
        System.out.println("Phone call from Australia cost: "+australiaMinutes*australiaPhoneCost);

    }
}
