package com.softserve.sorting;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public abstract class DataType<T> {

    public abstract List<T> readInputValues(Scanner scanner);

    public abstract T getMax();

    public long getMaxOccurrences(List<T> inputValues, T maxValue) {
        return Collections.frequency(inputValues, maxValue);
    }

    public long countOccurrencesPercentage(int totalValues, long occurrences) {
        return (100 / totalValues) * occurrences;
    }

    public abstract void processAndPrintResults();

}
