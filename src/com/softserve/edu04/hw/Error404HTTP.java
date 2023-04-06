package com.softserve.edu04.hw;

import java.util.Scanner;

public class Error404HTTP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an HTTP error code: ");
        int errorCode = input.nextInt();

        switch (errorCode) {
            case 400 -> System.out.println("HTTP Error 400: Bad Request");
            case 401 -> System.out.println("HTTP Error 401: Unauthorized");
            case 402 -> System.out.println("HTTP Error 402: Payment Required");
            case 403 -> System.out.println("HTTP Error 403: Forbidden");
            case 404 -> System.out.println("HTTP Error 404: Not Found");
            default -> System.out.println("Unknown HTTP error code.");
        }
    }
}
