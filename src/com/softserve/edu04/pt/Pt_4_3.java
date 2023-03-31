package com.softserve.edu04.pt;

import java.util.Scanner;

public class Pt_4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Country: ");
        String input = sc.nextLine();
        switch (input) {
            case "Ukraine":
                System.out.println(Country.Ukraine.getCounrty());
                break;
            case "USA":
                System.out.println(Country.USA.getCounrty());
                break;
            case "Nigeria":
                System.out.println(Country.Nigeria.getCounrty());
                break;
            case "Brazil":
                System.out.println(Country.Brazil.getCounrty());
                break;
            default:
                System.out.println("You wrote wrong country!");
                break;

        }
    }
}


