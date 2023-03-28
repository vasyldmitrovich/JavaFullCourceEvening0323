package com.softserve.edu01.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowerBedApp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, input the radius: ");
        Double radius = Double.valueOf(br.readLine());
        Double pi = Double.valueOf(3.14);

        Double perimeter = 2*pi*radius;
        Double square = pi*(radius*radius);

        System.out.println("Flower bed perimeter is " + perimeter.floatValue());
        System.out.println("Flower bed square is " + square.floatValue());
    }
}
