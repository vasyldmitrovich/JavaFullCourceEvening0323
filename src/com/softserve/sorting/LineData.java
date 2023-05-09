package com.softserve.sorting;

import java.util.*;
import java.util.stream.Collectors;

import static com.softserve.sorting.Constants.SortingType.BY_COUNT;
import static com.softserve.sorting.Constants.SortingType.NATURAL;

public class LineData extends DataType<String> {

    private List<String> values;

    public LineData(Scanner scanner) {
        this.values = readInputValues(scanner);
    }
    @Override
    public List<String> readInputValues(Scanner scanner) {
        List<String> lines = new ArrayList<>();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            lines.add(line);
        }
        return lines;
    }

    @Override
    public void process(String sortingType) {
        printTotal();
        sortAndPrint(sortingType);
    }

    public void printTotal() {
        System.out.printf("Total lines: %d.%n", values.size());
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
                System.out.println("Sorted data:");
                values.stream()
                        .map(String::valueOf)
                        .forEach(System.out::println);
                break;
        }
    }

    @Override
    public String getMax() {
        return Collections.max(this.values, Comparator.comparing(s -> s.length()));
    }
    public void findLongestLine() {
        printTotal();
        String longestValue = this.getMax();
        long occurrences = getMaxOccurrences(values, longestValue);
        long occurrencesPercentage = countOccurrencesPercentage(values.size(), occurrences);
        System.out.printf("The longest line: \n%s\n(%d time(s), %d%%).", longestValue, occurrences, occurrencesPercentage);
    }

    @Override
    public String toString() {
        return "LineData{" +
                "values=" + values +
                '}';
    }
}
