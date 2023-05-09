package com.softserve.sorting;

import java.util.*;
import java.util.stream.Collectors;

import static com.softserve.sorting.Constants.SortingType.BY_COUNT;
import static com.softserve.sorting.Constants.SortingType.NATURAL;

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
    public void process(String sortingType) {
        printTotal();
        sortAndPrint(sortingType);
    }

    public void printTotal() {
        System.out.printf("Total words: %d.%n", values.size());
    }

    @Override
    public void sortAndPrint(String sortingType) {
        // Sort words and print results
        switch (sortingType) {
            case BY_COUNT:
                sortByCount(values, "%s: %d time(s), %d%%%n");
                break;
            case NATURAL:
            default:
                values.sort(Comparator.naturalOrder());
                String output = values.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(" "));
                System.out.printf("Sorted data: %s", output);
                break;
        }
    }

    @Override
    public String getMax() {
        return Collections.max(this.values, Comparator.comparing(s -> s.length()));
    }

    public void findLongestValue() {
        printTotal();
        String longestValue = this.getMax();
        long occurrences = getMaxOccurrences(values, longestValue);
        long occurrencesPercentage = countOccurrencesPercentage(values.size(), occurrences);
        System.out.printf("The longest word: %s (%d time(s), %d%%).", longestValue, occurrences, occurrencesPercentage);
    }

    @Override
    public String toString() {
        return "WordData{" +
                "values=" + values +
                '}';
    }
}
