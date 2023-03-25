package com.softserve.edu04.pt04;

import java.util.Scanner;

public class PracticalTask03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву країни:");
        String countryName = scanner.nextLine();

        Continent continent = null;

        if (countryName.equals("Франція") || countryName.equals("Іспанія") || countryName.equals("Німеччина")) {
            continent = Continent.EUROPE;
        } else if (countryName.equals("Китай") || countryName.equals("Індія") || countryName.equals("Японія")) {
            continent = Continent.ASIA;
        } else if (countryName.equals("Египет") || countryName.equals("Нігерія") || countryName.equals("Конго")) {
            continent = Continent.AFRICA;
        } else if (countryName.equals("Канада") || countryName.equals("США") || countryName.equals("Мексика")) {
            continent = Continent.NORTH_AMERICA;
        } else if (countryName.equals("Бразилія") || countryName.equals("Аргентина") || countryName.equals("Чилі")) {
            continent = Continent.SOUTH_AMERICA;
        } else if (countryName.equals("Австралія") || countryName.equals("Нова Зеландія") || countryName.equals("Папуа-Нова Гвінея")) {
            continent = Continent.AUSTRALIA;
        } else if (countryName.equals("Антарктида")) {
            continent = Continent.ANTARCTICA;
        } else {
            System.out.println("Невідома країна!");
            return;
        }

        System.out.println("Назва материка: " + continent.getContinentName());
    }
}

