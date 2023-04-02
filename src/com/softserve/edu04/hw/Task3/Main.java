package com.softserve.edu04.hw.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter error code");
        int errorCode = scanner.nextInt();
        if (errorCode >= 400 && errorCode <= 404) {
            HTTPError httpError = null;
            for (HTTPError error : HTTPError.values()) {
                if (error.getCode() == errorCode) {
                    httpError = error;
                    break;
                }
            }
            System.out.println("Error name: " + httpError.getErrorName());
        } else {
            System.out.println("Please enter error code in range 400 - 404");
        }
    }
}
