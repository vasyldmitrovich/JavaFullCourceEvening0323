package com.softserve.sorting;

import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(final String[] args) throws ParseException {
        List<String> arguments = Arrays.asList(args);
        System.out.println(arguments);
        Map<String, String> argumentsMap = parseCommandLine(arguments);
        String sortingType = argumentsMap.get("sortingType");
        String dataType = argumentsMap.get("dataType");

        Scanner scanner = new Scanner(System.in);

        if ("long".equals(dataType)) {
            processLong(scanner, sortingType);
        } else if ("line".equals(dataType)) {
            processLine(scanner);
        } else if ("word".equals(dataType)) {
            processWord(scanner);
        } else {
            processWord(scanner);
        }
    }

    public static Map<String, String> parseCommandLine(List<String> arguments) {
        Map<String, String> argsValues = new HashMap<>();
        for (int i = 0; i < arguments.size(); i++) {
            if (arguments.get(i).equals("-sortingType")) {
                argsValues.put("sortingType", arguments.get(i + 1));
            } else if (arguments.get(i).equals("-dataType")) {
                argsValues.put("dataType", arguments.get(i + 1));
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

        if ("natural".equals(sortingType)) {
            Collections.sort(numbers);
            System.out.println(String.format("Total numbers: %d.", numbers.size()));
            String output = "Sorted data: " + numbers;
            System.out.println(output.replaceAll("\\[", "")
                    .replaceAll("]", "")
                    .replaceAll(",", ""));
        }
        if ("byCount".equals(sortingType)) {
            Collections.sort(numbers);
            int numbersSize = numbers.size();
            Map<Long, Integer> numbersMap = new TreeMap<>();
            for (Long number : numbers) {
                numbersMap.put(number, Collections.frequency(numbers, number));
            }

            System.out.println(String.format("Total numbers: %d.", numbers.size()));
            for (var entry: numbersMap.entrySet()) {
                System.out.println(String.format("%d: %d time(s), %d%%",
                        entry.getKey(), entry.getValue(), getOccurrence(entry.getValue(), numbersSize)));
            }
        }
    }

    public static void processLine(Scanner scanner) {
        List<String> lines = new ArrayList<>();

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            lines.add(line);
        }

        String longest = Collections.max(lines, Comparator.comparing(s -> s.length()));
        long times = Collections.frequency(lines, longest);
        System.out.println(String.format("Total lines: %d.", lines.size()));
        System.out.println(String.format("The longest line: \n%s\n(%d time(s), %d%%).",
                longest, times, getOccurrence(times, lines.size())));
    }

    public static void processWord(Scanner scanner) {
        List<String> words = new ArrayList<>();

        while (scanner.hasNext()) {
            String line = scanner.next();
            words.add(line);
        }

        String longest = Collections.max(words, Comparator.comparing(s -> s.length()));
        long times = Collections.frequency(words, longest);
        System.out.println(String.format("Total words: %d.", words.size()));
        System.out.println(String.format("The longest word: %s (%d time(s), %d%%).",
                longest, times, getOccurrence(times, words.size())));
    }

    public static long getOccurrence(long times, int size) {
        return (100 / size) * times;
    }
}
