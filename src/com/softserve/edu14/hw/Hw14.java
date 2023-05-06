/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.edu14.hw;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rgonchar
 */
public class Hw14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Task_1
        String s = "abc";
        int shiftValue = 3;
        char[] result = new char[s.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = (char) (s.charAt(i) + shiftValue);
        }
        String destString = new String(result);
        
        System.out.println("Source string: " + s);
        String encrypted = encrypt(s,3);
        System.out.println("Encrypt: "+ encrypted);
        System.out.println("Dencrypt: "+ dencrypt(encrypted,3));
        
        //Task_2
        DateValidator validator = new DateValidatorUsingLocalDate("MM.dd.yy");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input date in format mm.dd.yy: ");
        String dateForValidation = sc.nextLine();
        System.out.println("Date format: " + validator.isValid(dateForValidation));
        
        //Task_3
        System.out.print("Please input year: ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        LocalDate y = LocalDate.now();
        System.out.println("The year " + year + " is leap: " +  y.withYear(year).isLeapYear());
        
        //Task_4
        LocalDate birthday = LocalDate.of(1984, Month.DECEMBER, 11);
        System.out.println("Birthday: " + birthday);
        dates(birthday);
        
    }

    public static String encrypt(String s, int n) {
        char[] result = new char[s.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = (char) (s.charAt(i) + n);
        }
        String destString = new String(result);
        return destString;
    }
    public static String dencrypt(String s, int n) {
        char[] result = new char[s.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = (char) (s.charAt(i) - n);
        }
        String destString = new String(result);
        return destString;
    }
    
    public static void dates (LocalDate ld){
        System.out.println("Birthday day of week: " + ld.getDayOfWeek());
        System.out.println("Birthday + 6 month: " + ld.plusMonths(6).getDayOfWeek());
        System.out.println("Birthday + 12 month: " + ld.plusMonths(12).getDayOfWeek());
    }
    
   
}
