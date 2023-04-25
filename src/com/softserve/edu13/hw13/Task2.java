package com.softserve.edu13.hw13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task2 {
    public static void main(String[] args) {
        showCurrentDate();
    }

    private static void showCurrentDate() {
        long currentTime = System.currentTimeMillis();
        Date date = new Date(currentTime);
        String myTime = new SimpleDateFormat("yyyy.MM.dd").format(date);
        System.out.println("Current date " + myTime);
    }
}
