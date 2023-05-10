package com.softserve.MyProject;

import java.util.Scanner;

public class MoneyConverter {
    private static ExchangeService exchangeService = new ExchangeService();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double exchangeUSD = exchangeService.getCurrencyRate("USD");
        double exchangeEUR = exchangeService.getCurrencyRate("EUR");
        double exchangePLN = exchangeService.getCurrencyRate("PLN");

        String choice = "Y";

        while (choice.equals("Y")) {
            System.out.print("Введіть валюту, яку ви хочете конвертувати (UAH, USD, EUR або PLN): ");
            String currency = input.nextLine().toUpperCase();

            System.out.print("Введіть суму валюти, яку ви хочете конвертувати: ");
            double amount = input.nextDouble();

            double uahAmount, usdAmount, eurAmount, plnAmount;

            switch (currency) {
                case "UAH":
                    usdAmount = amount / exchangeUSD;
                    eurAmount = amount / exchangeEUR;
                    plnAmount = amount / exchangePLN;

                    System.out.printf("%.2f UAH = %.2f USD\n", amount, usdAmount);
                    System.out.printf("%.2f UAH = %.2f EUR\n", amount, eurAmount);
                    System.out.printf("%.2f UAH = %.2f PLN\n", amount, plnAmount);
                    break;

                case "USD":
                    uahAmount = amount * exchangeUSD;
                    eurAmount = amount / exchangeEUR * exchangeUSD;
                    plnAmount = amount / exchangePLN * exchangeUSD;

                    System.out.printf("%.2f USD = %.2f UAH\n", amount, uahAmount);
                    System.out.printf("%.2f USD = %.2f EUR\n", amount, eurAmount);
                    System.out.printf("%.2f USD = %.2f PLN\n", amount, plnAmount);
                    break;

                case "EUR":
                    uahAmount = amount * exchangeEUR;
                    usdAmount = amount / exchangeUSD * exchangeEUR;
                    plnAmount = amount / exchangePLN * exchangeEUR;

                    System.out.printf("%.2f EUR = %.2f UAH\n", amount, uahAmount);
                    System.out.printf("%.2f EUR = %.2f USD\n", amount, usdAmount);
                    System.out.printf("%.2f EUR = %.2f PLN\n", amount, plnAmount);
                    break;

                case "PLN":
                    uahAmount = amount * exchangePLN;
                    usdAmount = amount / exchangeUSD * exchangePLN;
                    eurAmount = amount / exchangeEUR * exchangePLN;

                    System.out.printf("%.2f PLN = %.2f UAH\n", amount, uahAmount);
                    System.out.printf("%.2f PLN = %.2f USD\n", amount, usdAmount);
                    System.out.printf("%.2f PLN = %.2f EUR\n", amount, eurAmount);
                    break;

                default:
                    System.out.println("Введена валюта не підтримується.");
                    break;
            }

            input.nextLine();

            System.out.print("Бажаєте продовжити (Y/N)? ");
            choice = input.nextLine();
        }
        input.close();
    }
}


