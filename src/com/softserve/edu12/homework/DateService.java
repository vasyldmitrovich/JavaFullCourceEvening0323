package com.softserve.edu12.homework;

import java.time.LocalDate;

@FunctionalInterface
public interface DateService {

    String getDayInWeekAfterMonths(int number, LocalDate birthday);
}
