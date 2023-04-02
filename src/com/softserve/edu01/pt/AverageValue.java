package com.softserve.edu01.pt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AverageValue {
    public static void main(String[] args) throws IOException {

        double number1 = getNumber("Input first number:");
        double number2 = getNumber("Input second number:");
        double number3 = getNumber("Input third number:");

        double averageValue = (number1 + number2 + number3) / 3;
        System.out.println("Average is: " + averageValue);
    }

    static double getNumber(String message) throws IOException {
        BufferedReader numberReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(message);
        return Double.parseDouble(numberReader.readLine());
    }
}
