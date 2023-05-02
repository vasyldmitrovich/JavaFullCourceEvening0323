package com.softserve.edu13.hm13;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class HomeWork2 {
    //Where this method run???
    public static boolean isValidDate(String date) {
        DateFormat dateFormat = new SimpleDateFormat("MM.dd.yy");
        dateFormat.setLenient(false); // to enforce strict date parsing
        try {
            dateFormat.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
