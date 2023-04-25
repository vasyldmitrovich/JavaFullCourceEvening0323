package com.softserve.edu13.pt13;

import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {
        String day = LocalDate.now().getDayOfWeek().name();
        System.out.println("Current day of week is "+day);
    }
}
