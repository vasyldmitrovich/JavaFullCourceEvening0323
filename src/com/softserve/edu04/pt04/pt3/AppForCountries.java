package com.softserve.edu04.pt04.pt3;

import java.util.Scanner;

public class AppForCountries {
    public static void main(String[] args) {
        Continents continents = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name of the country");
        String country = scanner.nextLine();
        switch (country) {
            case "China":
            case "Japan":
            case "Thailand":
            case "Bali":
                System.out.println(continents = Continents.ASIA);
                break;
            case "Ukraine":
            case "Italy":
            case "France":
            case "Germany":
                System.out.println(continents = Continents.EUROPE);
                break;
            case "USA":
            case "Canada":
            case "Chili":
            case "Peru":
                System.out.println(continents = Continents.AMERICA);
                break;

        }
    }
}
