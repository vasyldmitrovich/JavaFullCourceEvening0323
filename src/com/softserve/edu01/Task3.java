package com.softserve.edu01;

public class Task3 {
    public static double dollarConvert (double kurs, double grivnas){
        double dollars = 0;
        dollars = grivnas / kurs;
        return dollars;
    }

    public static void main(String[] args) {
        System.out.println(dollarConvert(40, 1000));
    }
}
