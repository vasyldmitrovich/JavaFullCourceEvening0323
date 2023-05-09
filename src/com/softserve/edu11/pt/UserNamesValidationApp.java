package com.softserve.edu11.pt;

import java.util.Scanner;

public class UserNamesValidationApp {

    public static void main(String[] args) {
        String regularExpression = "[a-zA-Z_0-9]{3,15}";
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d - Please, input user name: ", i);
            String userName = scanner.nextLine();
            if (userName.matches(regularExpression)) {
                System.out.printf("User name '%s' is valid\n", userName);
            } else {
                System.out.printf("This name is not valid!\n");
            }
        }

    }
}
