package com.softserve.sorting;

import java.util.*;

public class WordData extends DataType<String> {

    private List<String> values;

    public WordData(Scanner scanner) {
        this.values = readInputValues(scanner);
    }

    @Override
    public List<String> readInputValues(Scanner scanner) {
        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            String line = scanner.next();
            words.add(line);
        }
        return words;
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
        System.out.println(String.format("Total words: %d.", values.size()));
        System.out.println(String.format("The longest word: %s (%d time(s), %d%%).",
                longestValue, occurrences, occurrencesPercentage));
    }
}
