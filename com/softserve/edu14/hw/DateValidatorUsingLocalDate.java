/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.edu14.hw;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author rgonchar
 */
public class DateValidatorUsingLocalDate implements DateValidator {

    private DateTimeFormatter dateFormatter;

    public DateValidatorUsingLocalDate(String dateFormatter) {
        this.dateFormatter = DateTimeFormatter.ofPattern(dateFormatter);
    }

    @Override
    public boolean isValid(String dateStr) {
        try {
            LocalDate.parse(dateStr, this.dateFormatter);
        } catch (DateTimeParseException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

}
