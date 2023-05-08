package com.softserve.sorting;

import java.util.*;

import static com.softserve.sorting.Constants.CommandLineParameters.DATA_TYPE;
import static com.softserve.sorting.Constants.DataTypeParameters.LINE;
import static com.softserve.sorting.Constants.DataTypeParameters.LONG;

public class MainApp {

    public static void main(final String[] args) {

        if (DATA_TYPE.equals(args[0])) {
            Scanner scanner = new Scanner(System.in);

            if (LONG.equals(args[1])) {
                DataType numbers = new LongData(scanner);
                numbers.processAndPrintResults();

            } else if (LINE.equals(args[1])) {
                new LineData(scanner).processAndPrintResults();

            } else {
                new WordData(scanner).processAndPrintResults();
            }
        }
    }
}
