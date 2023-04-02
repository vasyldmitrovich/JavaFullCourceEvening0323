package com.softserve.edu04.pt;

import java.util.Scanner;
public class ThirdTaskCountriesInfo {
    public static void main(String[] args) {
        System.out.println(Enum.valueOf(Continents.class,getTheCountry()));
    }

    static String getTheCountry(){
        System.out.println("Input the name of the country " + Continents.getTheCatalogue());
        return new Scanner(System.in).next().toUpperCase();
    }
}
