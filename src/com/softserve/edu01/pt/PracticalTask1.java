package com.softserve.edu01.pt;

import java.util.Scanner;

public class PracticalTask1 {
    public static void main(String[] args) {
        System.out.println("Input text please.");
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        String s3 = scan.nextLine();
        System.out.println(s1 + "\n" + s2 + "\n" + s3);
        System.out.println(s3 + "\n" + s2 + "\n" + s1);
    }
}
