package com.softserve.sorting;

import java.util.*;
import java.util.stream.Collectors;

import static com.softserve.sorting.Constants.SortingType.BY_COUNT;
import static com.softserve.sorting.Constants.SortingType.NATURAL;

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
    public void process(String sortingType) {
        printTotal();
        sortAndPrint(sortingType);
    }

    public void printTotal() {
        System.out.printf("Total numbers: %d.%n", values.size());
    }

    @Override
    public void sortAndPrint(String sortingType) {
        // Sort and print results
        switch (sortingType) {
            case BY_COUNT:
                sortByCount(values, "%d: %d time(s), %d%%%n");
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
    public Long getMax() {
        return Collections.max(this.values);
    }

    public void findGreatestNumber() {
        printTotal();
        Long greatestValue = getMax();
        long occurrences = getMaxOccurrences(values, greatestValue);
        long occurrencesPercentage = countOccurrencesPercentage(values.size(), occurrences);
        System.out.printf("The greatest number: %s (%d time(s), %d%%).", greatestValue, occurrences, occurrencesPercentage);
    }

    @Override
    public String toString() {
        return "LongData{" +
                "values=" + values +
                '}';
    }
}
