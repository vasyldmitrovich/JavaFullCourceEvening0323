package com.softserve.edu12.homework;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Need create method where for user show message and this method return data what user input, there call this method
        System.out.println("Task with year leap");
        System.out.println("Input year");
        int year = scanner.nextInt();
        System.out.println(checkYearLeap(year) ? "Yes, year is leap" : "No, year is not leap");
        System.out.println("Task with your birthday");
        LocalDate birthday = LocalDate.of(2002,03,13);
        System.out.println("My birthday = "+birthday);
        System.out.println("Day in week = "+getWeekInDate(birthday));
        DateService dateService = (number, localDate)-> localDate.plusMonths(number).getDayOfWeek().name();
        System.out.println("Day in week after 6 month = "+dateService.getDayInWeekAfterMonths(6,birthday));
        System.out.println("Day in week after 12 month = "+dateService.getDayInWeekAfterMonths(12,birthday));
        System.out.println("Task for working with format");
        String date = scanner.next();
        System.out.println(checkFormatForDate(date) ? "Yes, date is fits!" : "No, date is not fits!");
        System.out.println("Task with encoder and decoder");
        System.out.println("Input string ");
        String strForProcess = scanner.next();
        System.out.println("Input number");
        int number = scanner.nextInt();
        System.out.println("String for operation = "+strForProcess);
        String strAfterEncoder = encoder(strForProcess,number);
        System.out.println("Encoder = "+strAfterEncoder);
        System.out.println("Decoder = "+decoder(strAfterEncoder,number));
    }

    public static String encoder(String str, int number){
        String encoderStr = "";
        for(char elementStr : str.toCharArray()){
            byte elementStrInByte = (byte)elementStr;
            elementStrInByte += number;
            encoderStr += (char) elementStrInByte;
        }
        return encoderStr;
    }

    public static String decoder(String str, int number){
        String encoderStr = "";
        for(char elementStr : str.toCharArray()){
            byte elementStrInByte = (byte)elementStr;
            elementStrInByte -= number;
            encoderStr += (char) elementStrInByte;
        }
        return encoderStr;
    }

    public static boolean checkFormatForDate(String dateStr){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM.dd.yy");
        simpleDateFormat.setLenient(false);
        try {
            simpleDateFormat.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static String getWeekInDate(LocalDate birthday){
        return birthday.getDayOfWeek().name();
    }

    public static boolean checkYearLeap(int year){
        return Year.of(year).isLeap();
    }
}
