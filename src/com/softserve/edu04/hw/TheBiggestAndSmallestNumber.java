package com.softserve.edu04.hw;

import java.util.Arrays;
import java.util.Scanner;

public class TheBiggestAndSmallestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write three integer numbers-");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        int [] array= new int[]{num1, num2, num3};
        Arrays.sort(array);
        System.out.println("The smallest number- "+array[0]);
        System.out.println("The biggest number -"+ array[array.length-1]);
    }
}
