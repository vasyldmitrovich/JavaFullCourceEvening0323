package com.softserve.edu01.pt;

import java.util.Scanner;

public class AppP_1_4{
    public static void main(String[] args) {
        answer();
    }

    public static void answer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How are you?");
        String answer = sc.nextLine();
        System.out.println("You are " + answer);

    }
}
