package com.softserve.edu05.hw;

import java.util.Scanner;

public class hw1Task1 {
    public int Month(int a, int b){
        return a;

    }
    public static void main(String[] args) {
        int [] Array1=new int[30];
        int [] Array2=new int[31];
        int [] Array3=new int[28];
        System.out.println("Input nomber of month");
        Scanner k =new Scanner(System.in);
       int number= k.nextInt();

            if(number==4 || number==6|| number==9 || number==11 ){
                System.out.println("the number of days in that month"+Array1.length);
            } else if (number==2) {
                System.out.println("the number of days in that month"+Array3.length);
                
            }
            else{
                System.out.println("the number of days in that month"+Array2.length);
            }



    }
}
