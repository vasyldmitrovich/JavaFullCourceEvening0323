package com.softserve.edu13.hw;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeWork2 {
    public static void main(String[] args) {
        String dateStr = "01.28.88";
        boolean isValid = isValidDate(dateStr);
        System.out.println(isValid);
    }

    //Perfect
    public static boolean isValidDate(String dateStr) {
        if (dateStr.length() != 8) {
            return false;
        }
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM.dd.yy");
            dateFormat.setLenient(false);
            Date date = dateFormat.parse(dateStr);
            return dateStr.equals(dateFormat.format(date));
        } catch (ParseException e) {
            return false;
        }
    }
}
