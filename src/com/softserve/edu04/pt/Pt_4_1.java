package com.softserve.edu04.pt;

import java.util.Scanner;

public class Pt_4_1 {
    public static void main(String[] args){
    odds();
    }



    public static void odds(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1-st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2-nd number: ");
        int b = sc.nextInt();
        System.out.println("Enter 3-d number: ");
        int c = sc.nextInt();



        int arr[] = new int [3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        int i = 0;
        for( int x = 0;x<arr.length;x++ ){
            if (arr[x]%2 == 0) {
                i += 1;

            }
        }
        System.out.println("The amount of odd numbers is: "+i);


    }
}