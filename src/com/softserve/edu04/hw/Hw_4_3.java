package com.softserve.edu04.hw;

import java.util.Scanner;

public class Hw_4_3 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ERROR code (404, 410, 502, 301): ");
        int input = sc.nextInt();

        switch (input) {
            case 404:
                System.out.println("Error meaning: " + Http_error.Error_404.getUrl());
                break;
            case 410:
                System.out.println("Error meaning:  " + Http_error.Error_410.getUrl());
                break;
            case 502:
                System.out.println("Error meaning: " + Http_error.Error_502.getUrl());
                break;
            case 301:
                System.out.println("Error meaning: " + Http_error.Error_301.getUrl());
                break;
            default:
                System.out.println("No such an error!!");
                break;
        }
    }
}
