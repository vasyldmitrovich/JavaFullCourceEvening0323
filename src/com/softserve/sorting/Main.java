package com.softserve.sorting;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(final String[] args) throws Exception {

        Map<String, String> arguments = parseCommandLine(Arrays.asList(args));
        String sortingType = arguments.get("-sortingType");
        String dataType = arguments.get("-dataType");

        Scanner scanner = new Scanner(System.in);

        if ("long".equals(dataType)) {
            processLong(scanner, sortingType);
        } else if ("line".equals(dataType)) {
            processLine(scanner, dataType, sortingType);
        } else if ("word".equals(dataType)) {
            processWord(scanner, dataType, sortingType);
        } else {
            processWord(scanner, dataType, sortingType);
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

    public static void processLong(Scanner scanner, String sortingType) {
        List<Long> numbers = new ArrayList<>();
        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            numbers.add(number);
        }

        final int numbersSize = numbers.size();
        System.out.printf("Total numbers: %d.%n", numbersSize);

        if ("byCount".equals(sortingType)) {

            Map<Long, Integer> numbersMap = new TreeMap<>();
            for (Long number : numbers) {
                numbersMap.put(number, Collections.frequency(numbers, number));
            }

            System.out.printf("Sorted data:%n");
            numbersMap.entrySet().stream()
                    //.sorted(Map.Entry.comparingByKey())
                    .sorted(Map.Entry.comparingByValue())
                    .forEach(entry -> System.out.printf("%d: %d time(s), %d%%%n",
                            entry.getKey(), entry.getValue(), getOccurrence(entry.getValue(), numbersSize)));

//            Map<Long, Integer> sortedMap = new LinkedHashMap<>();
//            Stream<Map.Entry<Long,Integer>> st = numbersMap.entrySet().stream();
//            st.sorted(Comparator.comparing(e -> e.getValue()))
//                    .forEach(e -> sortedMap.put(e.getKey(), e.getValue()));
//            for (var entry: sortedMap.entrySet()) {
//                System.out.println(String.format("%d: %d time(s), %d%%",
//                        entry.getKey(), entry.getValue(), getOccurrence(entry.getValue(), numbersSize)));
//            }

        }
        else {
            //Collections.sort(numbers);
            numbers.sort(Comparator.naturalOrder());
            String output = numbers.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(" "));
            System.out.printf("Sorted data: %s", output);
        }
    }

    public static void processLine(Scanner scanner, String dataType, String sortingType) {
        List<String> lines = new ArrayList<>();

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            lines.add(line);
        }

        processStrings(lines, dataType, sortingType);
    }

    public static void processWord(Scanner scanner, String dataType, String sortingType) {
        List<String> words = new ArrayList<>();

        while (scanner.hasNext()) {
            String line = scanner.next();
            words.add(line);
        }

        processStrings(words, dataType, sortingType);
    }

    public static void processStrings(List<String> strings, String dataType, String sortingType) {

        Collections.sort(strings);
        System.out.println(String.format("Total %ss: %d.", dataType, strings.size()));

        if ("byCount".equals(sortingType)) {
            int stringsSize = strings.size();

            Map<String, Integer> numbersMap = new TreeMap<>();
            for (String str: strings) {
                numbersMap.put(str, Collections.frequency(strings, str));
            }

            Map<String, Integer> sortedMap = new LinkedHashMap<>();
            Stream<Map.Entry<String, Integer>> st = numbersMap.entrySet().stream();
            st.sorted(Comparator.comparing(e -> e.getValue()))
                    .forEach(e -> sortedMap.put(e.getKey(), e.getValue()));

            for (var entry: sortedMap.entrySet()) {
                System.out.println(String.format("%s: %d time(s), %d%%",
                        entry.getKey(), entry.getValue(), getOccurrence(entry.getValue(), stringsSize)));
            }
        } else {
            if ("line".equals(dataType)) {
                System.out.println("Sorted data:");
                for (String str: strings) {
                    System.out.println(str);
                }
            } else {
                String output = "Sorted data: " + strings;
                System.out.println(output.replaceAll("\\[", "")
                        .replaceAll("]", "")
                        .replaceAll(",", ""));
            }
        }
    }

    public static long getOccurrence(long times, int size) {
        return (100 / size) * times;
    }
}
