package com.softserve.edu04.pt;

import java.util.Scanner;

public class CountryMainland {
    enum Continent {
        AFRICA, ANTARCTICA, ASIA, AUSTRALIA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a country name: ");
        String country = scanner.nextLine().toUpperCase();

        Continent continent;
        switch (country) {
            //Egypt kenya etc... must be in constructor of enum
            case "EGYPT", "KENYA", "SOUTH AFRICA" -> continent = Continent.AFRICA;
            case "ANTARCTICA" -> continent = Continent.ANTARCTICA;
            case "CHINA", "INDIA", "JAPAN" -> continent = Continent.ASIA;
            case "AUSTRALIA", "NEW ZEALAND" -> continent = Continent.AUSTRALIA;
            case "FRANCE", "GERMANY", "SPAIN" -> continent = Continent.EUROPE;
            case "CANADA", "MEXICO", "UNITED STATES" -> continent = Continent.NORTH_AMERICA;
            case "ARGENTINA", "BRAZIL", "COLOMBIA" -> continent = Continent.SOUTH_AMERICA;
            default -> {
                System.out.println("Country not found!");
                return;
            }
        }

        System.out.println("The name of the continent: " + continent);
    }
}

