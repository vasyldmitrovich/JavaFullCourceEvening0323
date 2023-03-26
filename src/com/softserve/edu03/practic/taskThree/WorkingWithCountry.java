package src.com.softserve.edu03.practic.taskThree;

import java.util.Scanner;

public class WorkingWithCountry {
    private Scanner scanner = new Scanner(System.in);
    public void startWorkingWithCountryAndContinent(){
        System.out.println("Input please country:");
        String countryFromUser = scanner.nextLine();
        Continent.foundContinent(countryFromUser);
    }
}
