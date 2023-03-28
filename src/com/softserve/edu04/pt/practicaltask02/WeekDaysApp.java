package com.softserve.edu04.pt.practicaltask02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeekDaysApp {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input day number (from 1 to 7): ");
        String dayNumber = br.readLine();

        if (Integer.parseInt(dayNumber) > 0 & Integer.parseInt(dayNumber) < 8) {
            System.out.print("Name of day is: ");
            printWeekDay(dayNumber);
        } else {
            System.out.println("Wrong day number entered!");
        }
    }

    public static void printWeekDay(String dayNumber) {
        switch (dayNumber) {
            case "1":
                printWeekDayUaEnFormat(WeekDays.MONDAY);
                break;
            case "2":
                printWeekDayUaEnFormat(WeekDays.TUESDAY);
                break;
            case "3":
                printWeekDayUaEnFormat(WeekDays.WEDNESDAY);
                break;
            case "4":
                printWeekDayUaEnFormat(WeekDays.THURSDAY);
                break;
            case "5":
                printWeekDayUaEnFormat(WeekDays.FRIDAY);
                break;
            case "6":
                printWeekDayUaEnFormat(WeekDays.SATURDAY);
                break;
            case "7":
                printWeekDayUaEnFormat(WeekDays.SUNDAY);
                break;
            default:
                System.out.println("Wrong day number!");
                break;
        }
    }

    public static void printWeekDayUaEnFormat(WeekDays weekDay) {
        System.out.println(weekDay.getUa()  + " - " + weekDay.getEn());
    }

}
