package com.softserve.edu04.hw4;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner errorScan = new Scanner(System.in);
        System.out.print("Enter your error number: ");
        int error = errorScan.nextInt();
        if (error == 400) {
            System.out.println(HTTPError.ERROR_LOGIN.name());
        }
        if (error == 401) {
            System.out.println(HTTPError.ERROR_PASSWORD.name());
        }
        if (error == 402) {
            System.out.println(HTTPError.ERROR_SYSTEM.name());
        }
    }
}
