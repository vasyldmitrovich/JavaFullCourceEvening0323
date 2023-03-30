package com.softserve.edu05.hw;

import java.util.Scanner;

public class hw2 {




    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);
        int i =1;

        do {
            System.out.println("input number a and b");

            int a = br.nextInt();
            int b= br.nextInt();
            int sum =a+b;
            System.out.println(sum);

            System.out.println("If you want try again input 1");
            int k = br.nextInt();
            k=i;
        } while (i==1);



    }
}
