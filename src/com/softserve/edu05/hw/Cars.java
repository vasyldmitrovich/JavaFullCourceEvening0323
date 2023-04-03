package com.softserve.edu05.hw;

import java.util.Scanner;

public class Cars {
    private String Type;
    private int Year;
    private double Capacity;


    Cars() {


    }

    public Cars(String type, int year, double capacity) {
        Type = type;
        Year = year;
        Capacity = capacity;

    }


    public String getType() {
        return Type;

    }

    public int getYear() {
        return Year;

    }

    public double getCapacity() {
        return Capacity;

    }

}
