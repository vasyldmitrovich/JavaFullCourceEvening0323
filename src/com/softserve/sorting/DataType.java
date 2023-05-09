package com.softserve.sorting;

import java.util.*;

public abstract class DataType<T> {

    public abstract List<T> readInputValues(Scanner scanner);

    public abstract T getMax();

    public abstract void process(String sortingType);

    public abstract void sortAndPrint(String sortingType);

    public void sortByCount(List<T> inputValues, String outputMessage) {
        Map<T, Integer> numbersMap = new TreeMap<>();
        for (T value : inputValues) {
            numbersMap.put(value, Collections.frequency(inputValues, value));
        }

        System.out.printf("Sorted data: %n");
        numbersMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.printf(outputMessage,
                        entry.getKey(), entry.getValue(), countOccurrencesPercentage(inputValues.size(), entry.getValue())));
    }

    public long countOccurrencesPercentage(int totalValues, long occurrences) {
        return (100 / totalValues) * occurrences;
    }

    public long getMaxOccurrences(List<T> inputValues, T maxValue) {
        return Collections.frequency(inputValues, maxValue);
    }

}
