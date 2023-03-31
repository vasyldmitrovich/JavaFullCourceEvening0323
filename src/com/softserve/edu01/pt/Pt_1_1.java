package com.softserve.edu01.pt;

import java.util.Scanner;

public class Pt_1_1 {
    public static void main(String[] args){
        rev();
    }


    public static void rev(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String a = sc.nextLine();
        System.out.println("Enter second word: ");
        String b = sc.nextLine();
        System.out.println("Enter third word: ");
        String c = sc.nextLine();
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
    }
}