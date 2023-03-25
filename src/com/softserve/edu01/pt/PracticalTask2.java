package com.softserve.edu01.pt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalTask2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please, input first number: ");
        Double number1 = Double.valueOf(br.readLine());

        System.out.println("Please, input second number: ");
        Double number2 = Double.valueOf(br.readLine());

        System.out.println("Please, input third number: ");
        Double number3 = Double.valueOf(br.readLine());

        //Double sum = number1 + number2 + number3;
        Double average = (number1 + number2 + number3)/3;
        System.out.println("Average is " + average);
    }
}
