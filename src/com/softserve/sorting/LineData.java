package com.softserve.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LineData extends DataType<String> {

    private List<String> values;

    public LineData(Scanner scanner) {
        this.values = readInputValues(scanner);
    }
    @Override
    public List<String> readInputValues(Scanner scanner) {
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            values.add(line);
        }
        return values;
    }

    @Override
    public String getMax() {
        return Collections.max(this.values, Comparator.comparing(s -> s.length()));
    }

    @Override
    public void processAndPrintResults() {
        String longestValue = this.getMax();
        long occurrences = getMaxOccurrences(values, longestValue);
        long occurrencesPercentage = countOccurrencesPercentage(values.size(), occurrences);
        System.out.println(String.format("Total lines: %d.", values.size()));
        System.out.println(String.format("The longest line: \n%s\n(%d time(s), %d%%).",
                longestValue, occurrences, occurrencesPercentage));
    }
}
