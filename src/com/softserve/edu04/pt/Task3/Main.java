package com.softserve.edu04.pt.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Continent continent = null;
        System.out.println("Enter country: ");
        String country = scanner.nextLine();

        switch (country.toLowerCase()) {
            case "франція":
            case "китай":
            case "казахстан":
                System.out.println(Continent.EURASIA.getContName());
                break;
            case "сша":
            case "канада":
            case "мексика":
                System.out.println(Continent.NORTH_AMERICA.getContName());
                break;
            case "бразилія":
            case "аргентина":
            case "колумбія":
                System.out.println(Continent.SOUTH_AMERICA.getContName());
                break;
            case "египет":
            case "туніс":
            case "алжир":
                System.out.println(Continent.AFRICA.getContName());
                break;
            case "австрвлія":
                System.out.println(Continent.AUSTRALIA.getContName());
                break;
            case "антарктида":
                System.out.println(Continent.ANTARCTICA.getContName());
                break;
            default:
                System.out.println("There are not a country like that!");
                break;
        }
    }
}
