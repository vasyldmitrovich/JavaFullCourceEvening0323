package com.softserve.edu01;

public class NumberOperation {

    public static String returnNumberEnglish(int number){
        String[] units = {
                "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen"
        };
        String[] tens = {
                "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
        };
        if (number < 20) {
            return units[number];
        } else if (number < 100) {
            return tens[number / 10] + ((number % 10 != 0) ? " " + units[number % 10] : "");
        }else if (number < 1000) {
            return units[number / 100] + " hundred" + ((number % 100 != 0) ? " " + returnNumberEnglish(number % 100) : "");
        }else if (number < 1_000_000) {
            return returnNumberEnglish(number / 1000) + " thousand" + ((number % 1000 != 0) ? " " + returnNumberEnglish(number % 1000) : "");
        }
        return "";
    }



    public static void main(String[] args) {
        System.out.println(returnNumberEnglish(11));
    }
}
