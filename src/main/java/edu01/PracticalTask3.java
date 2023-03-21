package edu01;

import java.util.Scanner;

public class PracticalTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first word");
        String first = sc.next();
        System.out.println("Please enter second word");
        String second = sc.next();
        System.out.println("Please enter third word");
        String third = sc.next();
        System.out.println(third+" "+second+" "+first);
    }
}
