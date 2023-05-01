package com.softserve.edu11.pt11;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Please create some method and call this method there, method should print message and return data from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first user name (should be between 3 to 15 characters and can contain only Latin alphabet, numbers, and underscores)");
        String firstUserName = sc.nextLine();
        ifMatches(firstUserName);
        System.out.println("Input second user name");
        String secondUserName = sc.nextLine();
        ifMatches(secondUserName);
        System.out.println("Input third user name");
        String thirdUserName = sc.nextLine();
        ifMatches(thirdUserName);
        System.out.println("Input fourth user name");
        String fourthUserName = sc.nextLine();
        ifMatches(fourthUserName);
        System.out.println("Input fifth user name");
        String fifthUserName = sc.nextLine();
        ifMatches(fifthUserName);
    }

    private static void ifMatches (String test){
        System.out.println("Result of validation");
        System.out.println(test.matches("[a-zA-Z_0-9]{3,15}"));
    }
}

