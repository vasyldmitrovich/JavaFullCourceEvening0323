package com.softserve.edu4.pt;

import java.util.Scanner;

public class Task1 {

    /*PLEASE USE REFORMAT CODE because i it is bad write code like that*/
    public static void main(String[] args) {
      /*  System.out.println("Введіть 1 число");
        numbers Num1 = new numbers();
System.out.println("Введіть 2 число");
        numbers Num2 = new numbers();
        System.out.println("Введіть 3 число");
        numbers Num3 = new numbers();*/
        MaxMin max=new MaxMin();
    max.max(max.getA(), max.getB(), max.getC());
    }
}

/*it is not necessary create class and write in this class one method, write this method in that class
* where is main method
*
* PLEASE REWRITE ALL YOUR CODE*/
class numbers{
    public numbers() {
        float a;
        Scanner br=new Scanner(System.in);
        a= br.nextFloat();
        if (a>=-5 && a<=5){
            System.out.println("This namber is [-5;5]");
        }
        else{
            System.out.println("This namber isn't [-5;5]");
        }
    }
}

class MaxMin {

    private int a;
    private int b;
    int c;


    public MaxMin() {

        Scanner br = new Scanner(System.in);
        a = br.nextInt();
        b = br.nextInt();
        c = br.nextInt();

    }
    public void max(int a ,int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;
        if (a > b && a > c) {
            System.out.println("Max is" + a);
        } else if (b > a && b > c) {
            System.out.println("Max is" + b);
        } else {
            System.out.println("Max is" + c);
        }
    }
    public void min(int a ,int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
        if(a>b && a>c ){
            System.out.println("Max is"+a);
        }
        else if( b>a && b>c){
            System.out.println("Max is"+b);
        }
        else{
            System.out.println("Max is"+c);
        }

    }
    public int getA() {
        return a;
    }

    // Setter
    public void setA(int newA) {
        this.a = newA;

    }
    public int getB() {
        return b;
    }

    // Setter
    public void setB(int newB) {
        this.b = newB;

    }
    public int getC() {
        return c;
    }

}