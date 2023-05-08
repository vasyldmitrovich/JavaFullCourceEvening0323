package com.softserve.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LongData extends DataType<Long> {

    private List<Long> values;

    public LongData(Scanner scanner) {
        this.values = readInputValues(scanner);
    }

    @Override
    public List<Long> readInputValues(Scanner scanner) {
        List<Long> numbers = new ArrayList<>();
        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            numbers.add(number);
        }
        return numbers;
    }

    @Override
    public Long getMax() {
        return Collections.max(this.values);
    }

    @Override
    public void processAndPrintResults() {
        Long greatestValue = getMax();
        long occurrences = getMaxOccurrences(values, greatestValue);
        long occurrencesPercentage = countOccurrencesPercentage(values.size(), occurrences);
        System.out.println(String.format("Total numbers: %d.", values.size()));
        System.out.println(String.format("The greatest number: %s (%d time(s), %d%%).",
                greatestValue, occurrences, occurrencesPercentage));
    }

}
