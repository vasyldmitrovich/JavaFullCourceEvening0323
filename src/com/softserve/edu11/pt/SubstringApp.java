package com.softserve.edu11.pt;

import java.util.Scanner;

public class SubstringApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input first string: ");
        String str1 = scanner.nextLine();
        System.out.println("Please, input second string: ");
        String str2 = scanner.nextLine();

        if (str2.contains(str1)) {
            System.out.println(String.format("'%s' is substring of '%s'", str1, str2));
        } else {
            System.out.println(String.format("'%s' is not substring of '%s'", str1, str2));
        }
    }
}
