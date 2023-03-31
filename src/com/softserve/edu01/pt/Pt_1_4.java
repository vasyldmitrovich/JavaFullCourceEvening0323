package com.softserve.edu01.pt;

import java.util.Scanner;

public class Pt_1_4 {
    public static void main(String[] args) {
        hay();
    }


    public static void hay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How are You?: ");
        String answer = sc.nextLine();
        System.out.println("You are " + answer);

    }
}
