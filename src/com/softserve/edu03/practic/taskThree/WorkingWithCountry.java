package com.softserve.edu03.practic.taskThree;

import java.util.Scanner;

public class WorkingWithCountry {
    private Scanner scanner = new Scanner(System.in);

    public void startWorkingWithCountryAndContinent() {
        System.out.println("Input please country:");
        String countryFromUser = scanner.nextLine();
        foundContinent(countryFromUser);
    }
    private void foundContinent(String countryFromUser) {
        String result = "";
        while (true) {
            if (checkResult(Continent.ASIA.checkContinentWithCountry(countryFromUser) == true ? "It is country " + countryFromUser + " location on Asia continent" : ""))
                break;
            if (checkResult(Continent.AFRICA.checkContinentWithCountry(countryFromUser) == true ? "It is country " + countryFromUser + " location on Africa continent" : ""))
                break;
            if (checkResult(Continent.NORTH_AMERICA.checkContinentWithCountry(countryFromUser) == true ? "It is country " + countryFromUser + " location on NORTH_AMERICA continent" : ""))
                break;
            if (checkResult(Continent.SOUTH_AMERICA.checkContinentWithCountry(countryFromUser) == true ? "It is country " + countryFromUser + " location on SOUTH_AMERICA continent" : ""))
                break;
            if (checkResult(Continent.ANTARCTICA.checkContinentWithCountry(countryFromUser) == true ? "It is country " + countryFromUser + " location on ANTARCTICA continent" : ""))
                break;
            if (checkResult(Continent.EUROPA.checkContinentWithCountry(countryFromUser) == true ? "It is country" + countryFromUser + " location on EUROPA continent" : ""))
                break;
            if (checkResult(Continent.AUSTRALIA.checkContinentWithCountry(countryFromUser) == true ? "It is country " + countryFromUser + " location on AUSTRALIA continent" : ""))
                break;
            if (result.length() == 0) {
                System.out.println("Continent not found!");
                break;
            }
        }

    }
    private boolean checkResult(String result) {
        if (result.length() != 0) {
            System.out.println(result);
            return true;
        }
        return false;
    }
}
