package com.softserve.edu01.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input cost c1: ");
        Double c1 = Double.valueOf(br.readLine());
        System.out.println("Input cost c2: ");
        Double c2 = Double.valueOf(br.readLine());
        System.out.println("Input cost c3: ");
        Double c3 = Double.valueOf(br.readLine());

        System.out.println("Input duration d1: ");
        Double d1 = Double.valueOf(br.readLine());
        System.out.println("Input duration d2: ");
        Double d2 = Double.valueOf(br.readLine());
        System.out.println("Input duration d3: ");
        Double d3 = Double.valueOf(br.readLine());

        System.out.println(outputMessageWithCalculatedCost(c1, d1));
        System.out.println(outputMessageWithCalculatedCost(c2, d2));
        System.out.println(outputMessageWithCalculatedCost(c3, d3));
    }

    public static String outputMessageWithCalculatedCost(Double cost, Double duration) {
        String message = String.format("Call with cost %s and duration %s total cost: $", cost.toString(), duration.toString());
        return message + Double.valueOf(cost*duration).floatValue();
    }
}
