package com.softserve.edu05.pt;

import java.util.Scanner;

public class task2 {

    public static void tru(float a){
        if(a%1==a||a%a==1)
        {
            System.out.println("Number "+a+" is  prime");
        }
        else{
            System.out.println("Number "+a+" is not  prime");
        }
    }

    public static void main(String[] args) {
        System.out.println(" Enter a positive integer ");
        Scanner br=new Scanner(System.in);
        float a=br.nextFloat();
        tru(a);
    }
}
