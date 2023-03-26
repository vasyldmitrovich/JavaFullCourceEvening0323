package com.softserve.edu04.hw04;

import java.util.Scanner;

public class HomeWork03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть номер помилки HTTP: ");
        int errorCode = scanner.nextInt();

        HTTPError httpError = null;

        for (HTTPError error : HTTPError.values()) {
            if (error.getCode() == errorCode) {
                httpError = error;
                break;
            }
        }

        if (httpError != null) {
            System.out.println("Помилка HTTP " + httpError.getCode() + ": " + httpError.getMessage());
        } else {
            System.out.println("Помилка HTTP " + errorCode + " не знайдена");
        }
    }
}
