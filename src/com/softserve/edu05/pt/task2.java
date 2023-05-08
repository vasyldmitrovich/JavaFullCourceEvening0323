package com.softserve.edu05.pt;

import java.util.Scanner;

public class task2 {

    /*What this method do? because I do not understand what it does, I read name of method       tru   and do not understand what that means?*/
    public static void tru(int a){
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
        int a=br.nextInt();
        tru(a);
    }
}
