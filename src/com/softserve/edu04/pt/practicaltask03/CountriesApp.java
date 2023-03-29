package com.softserve.edu04.pt.practicaltask03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountriesApp {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input country name: ");
        String country = br.readLine();

        /*Move this switch to some method, there call this method*/
        switch (country) {
            case "Germany":
            case "United Kingdom":
            case "France":
            case "Italy":
            case "Spain":
            case "Ukraine":
            case "Poland":
            case "Romania":
            case "Netherlands":
            case "Belgium":
            case "Czech Republic":
            case "Greece":
            case "Portugal":
            case "Sweden":
            case "Austria":
            case "Switzerland":
            case "Bulgaria":
            case "Denmark":
            case "Finland":
            case "Slovakia":
            case "Norway":
            case "Ireland":
            case "Moldova":
            case "Albania":
            case "Lithuania":
            case "Latvia":
            case "Estonia":
            case "Monaco":
                System.out.println(Continent.EUROPE.getName());
                break;
            case "China":
            case "India":
            case "Indonesia":
            case "Pakistan":
            case "Bangladesh":
            case "Japan":
            case "Philippines":
            case "Vietnam":
            case "Turkey":
            case "Iran":
            case "Thailand":
            case "Myanmar":
            case "South Korea":
            case "Iraq":
            case "Afghanistan":
            case "Saudi Arabia":
            case "Uzbekistan":
            case "Malaysia":
            case "Yemen":
            case "Nepal":
            case "North Korea":
            case "Sri Lanka":
            case "Kazakhstan":
            case "Syria":
            case "Cambodia":
            case "Qatar":
            case "Oman":
            case "Cyprus":
                System.out.println(Continent.ASIA.getName());
                break;
            case "United States":
            case "Mexico":
            case "Canada":
            case "Guatemala":
            case "Haiti":
            case "Dominican Republic":
            case "Cuba":
            case "Honduras":
                System.out.println(Continent.NORTH_AMERICA.getName());
                break;
            case "Brazil":
            case "Columbia":
            case "Argentina":
            case "Venezuela":
            case "Peru":
            case "Bolivia":
            case "Chile":
            case "Ecuador":
                System.out.println(Continent.SOUTH_AMERICA.getName());
                break;
            case "Egypt":
            case "Nigeria":
            case "Ethiopia":
            case "Congo":
            case "Tanzania":
                System.out.println(Continent.AFRICA.getName());
                break;
            case "Australia":
            case "New Zealand":
            case "Fiji":
            case "New Caledonia":
            case "Papua New Guinea":
            case "Solomon Island":
            case "Vanuatu":
                System.out.println(Continent.AUSTRALIA.getName());
                break;
            case "":
            case "Antarctica":
                System.out.println("There are no countries in " + Continent.ANTARCTICA.getName());
                break;
            default:
                System.out.println("Wrong country name or this country does not exist!");
                break;
        }
    }

}
