package com.softserve.edu04.pt4;

import java.util.Scanner;

public class PracticalTask3 {
    public static void main(String[] args) {
        System.out.print("Enter your country: ");
        Scanner scanCountries = new Scanner(System.in);
        String country = scanCountries.nextLine();
        String continents;
        continents = switch (country) {
            case "Ukraine", "Poland", "France" -> Continents.EUROPE.name();
            case "USA", "Mexico", "Canada" -> Continents.NORTH_AMERICA.name();
            case "Argentina", "Brazil", "Colombia" -> Continents.SOUTH_AMERICA.name();
            case "China", "India", "Thailand" -> Continents.ASIA.name();
            case "Australia" -> Continents.AUSTRALIA.name();
            case "Antarctica" -> Continents.ANTARCTICA.name();
            case "Algeria", "Libya", "Egypt" -> Continents.AFRICA.name();
            default -> "Not found!";
        };
        System.out.println(continents);
    }
}
