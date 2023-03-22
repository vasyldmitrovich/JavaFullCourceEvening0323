package com.softserve.edu03.pt.Task1;

public class Main {
    public static void main(String[] args){
        int num1 = Nums.getNumber("Enter the first number: ");
        int num2 = Nums.getNumber("Enter the second number: ");
        Nums num = new Nums();
        System.out.println("The sum of "+ num1 + " and " + num2 + " is " + num.getTotal(num1, num2));
        System.out.println("The average of "+ num1 + " and " + num2 + " is " + num.getAverage(num1, num2));

    }
}
