package com.softserve.edu01.pt;


import java.util.Scanner;

public  class smallest {
public static double Smalest(double a, double b, double c) {

        if(a<b || a<c ) {
                System.out.println(a);
            return a;

        }
        if(b<a||b<c){
                System.out.println(b);
        return b;}
        else
                System.out.println(c);
        return c;
        }
        public static void main(String[] args){

                Scanner br=new Scanner(System.in);
                double a=br.nextDouble();
                double b=br.nextDouble();
                double c=br.nextDouble();
                smallest.Smalest(a,b,c);

        }


}



