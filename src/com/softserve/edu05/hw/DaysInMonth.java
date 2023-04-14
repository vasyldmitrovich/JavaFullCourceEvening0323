package com.softserve.edu05.hw;

import java.time.Year;

public class DaysInMonth {
    private static int[][] months= new int[12][1];

    static {
        for(int i = 0; i < months.length; i++){
            int month = i + 1;
            if(month == 1 || month == 3 || month == 5 || month == 7
                    || month == 8 || month == 10 || month == 12){
                months[i][0] = 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                months[i][0] = 30;
            } else {
                int year = Year.now().getValue();
                if((year % 4 == 0 && year % 100 == 0) || year % 400 == 0){
                    months[i][0] = 29;
                } else {
                    months[i][0] = 28;
                }
            }
        }
    }

    static int getAmountOfDays(int monthNumber){
        return months[monthNumber-1][0];
    }

}
