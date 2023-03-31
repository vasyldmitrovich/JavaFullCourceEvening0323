package com.softserve.edu04.pt;

import java.util.Scanner;

public class AppP_4_3 {
    public static void main(String[] args) {
        findContinent();
    }

    public static void findContinent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the country in ukrainian --> ");
        String country = sc.nextLine();
        switch (country) {
            case "Україна", "Німеччина", "Китай", "Індія", "Туреччина", "Франція", "Іспанія", "Іран", "Італія":
                System.out.println("This country on continent --> " + Continent.Eurasia);
                break;
            case "Канада", "США", "Мексика", "Гаїті", "Ямайка":
                System.out.println("This country on continent --> " + Continent.NorthAmerica);
                break;
            case "Бразилія", "Аргентина", "Колумбія", "Перу", "Чилі":
                System.out.println("This country on continent --> " + Continent.SouthAmerica);
                break;
            case "Нігерія", "Єгипет", "Південна Африка", "Кенія", "Марокко":
                System.out.println("This country on continent --> " + Continent.Africa);
                break;
            default:
                System.out.println("Maybe you enter wrong data ?! ");
        }
    }
}
