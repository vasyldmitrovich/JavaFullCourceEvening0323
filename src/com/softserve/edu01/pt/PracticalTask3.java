package com.softserve.edu01.pt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalTask3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter variable a: ");
        Integer a = Integer.parseInt(br.readLine());
        System.out.println("Please, enter variable b: ");
        Integer b = Integer.parseInt(br.readLine());

        Integer sumResult = a + b;
        Integer subResult = a - b;
        int multiplyResult = a*b;
        Double divideResult = a.doubleValue()/b.doubleValue();

        System.out.println("Calculation results:" );
        System.out.println("a + b = " + sumResult);
        System.out.println("a - b = " + subResult);
        System.out.println("a * b = " + multiplyResult);
        System.out.println("a / b = " + divideResult);
    }
}
