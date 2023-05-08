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

    public static boolean checkPalindrome(String str){
        String stringReverse = new StringBuilder(str).reverse().toString();
        return str.equals(stringReverse);
    }

    public static int checkNumberStep(int number){
        int count = 0;
        while (true){
            if(number % 2 == 0){
                number = number / 2;
                count++;
            }else{
                number = number * 3 + 1;
                count++;
            }
            if(number == 1){
                return count;
            }
        }
    }



}
