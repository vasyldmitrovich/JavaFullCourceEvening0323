package com.softserve.edu04.pt04;

import java.util.Scanner;

public class PracticalTask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер дня тижня (1-7):");
        int dayOfWeek = scanner.nextInt();

        DayOfWeek[] daysOfWeek = DayOfWeek.values();

        if (dayOfWeek < 1 || dayOfWeek > daysOfWeek.length) {
            System.out.println("Неправильний номер дня тижня!");
            return;
        }

        DayOfWeek selectedDayOfWeek = daysOfWeek[dayOfWeek - 1];

        System.out.println("Назва дня тижня на українській мові: " + selectedDayOfWeek.getDayNameUkr());
        System.out.println("Day of the week in English: " + selectedDayOfWeek.getDayNameEng());
    }

}
