package edu01.pt1;

import java.util.Scanner;

public class PracticalTask01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        System.out.print("Enter the third string: ");
        String string3 = scanner.nextLine();
        scanner.close();

        System.out.println(string3);
        System.out.println(string2);
        System.out.println(string1);
    }
}
