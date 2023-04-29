package com.softserve.edu13.hw.Task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static boolean FormatValidate(String date){
        SimpleDateFormat format = new SimpleDateFormat("MM.dd.yy");
        format.setLenient(false);
        try {
            format.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
