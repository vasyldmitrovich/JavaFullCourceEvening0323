package com.softserve.sorting;

import java.util.*;

import static com.softserve.sorting.Constants.DataType.*;

public class MainApp {
    public static void main(String[] args) throws Exception {

        Map<String, String> arguments = parseCommandLine(Arrays.asList(args));
        String sortingType = arguments.get("-sortingType");
        String dataType = arguments.get("-dataType");

        Scanner scanner = new Scanner(System.in);
         switch (dataType) {
             case LONG:
                 LongData longs = new LongData(scanner);
                 longs.process(sortingType);
                 break;
             case LINE:
                 LineData lines = new LineData(scanner);
                 lines.process(sortingType);
                 break;
             case WORD:
             default:
                 WordData words = new WordData(scanner);
                 words.process(sortingType);
                 break;
         }
    }

    public static Map<String, String> parseCommandLine(List<String> arguments) throws Exception {

        Map<String, String> argsValues = new HashMap<>();
        for (int i = 0; i < arguments.size(); i++) {
            if (arguments.get(i).startsWith("-")) {
                if ((i + 1) < arguments.size()) {
                    argsValues.put(arguments.get(i), arguments.get(i + 1));
                } else {
                    argsValues.put(arguments.get(i), " ");
                }
            }
        }

        if (argsValues.containsKey("-sortingType")) {
            String sortingType = argsValues.get("-sortingType");
            if (sortingType == null) {
                throw new Exception("No sorting type defined!");

            } else if (!(sortingType.equals("natural") || sortingType.equals("byCount"))) {
                System.out.println("Unknown -sortingType value is provided. Default 'natural' will be used");
            }
        } else if (argsValues.containsKey("-dataType")) {
            String dataType = argsValues.get("-dataType");
            if (dataType == null) {
                throw new Exception("No data type defined!");

            } else if (!(dataType.equals("long") || dataType.equals("line") || dataType.equals("word"))) {
                System.out.println("Unknown -dataType value is provided. Default 'word' will be used");
            }

            for (var entry: argsValues.entrySet()) {
                if (!(entry.getKey().equals("-sortingType") || entry.getKey().equals("-dataType"))) {
                    System.out.println("\" " + entry.getKey() + " \" is not a valid parameter. It will be skipped.");
                }
            }

        }
        return argsValues;
    }

}
