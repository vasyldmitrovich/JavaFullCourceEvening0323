package com.softserve.edu12.hw.Task1;

public class Main {
    public static void main(String[] args) throws ArithmeticException{//This is not good
        //Do not throws ArithmeticException from main method
        //You should catch exactly this exception in block catch
        double div;
        try {
            div = div(150,0);
            System.out.println(div);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    private static double div(double num1, double num2){

        if (num2 == 0){
            throw new ArithmeticException("division by zero");
        }
        return num1/num2;
    }
}
