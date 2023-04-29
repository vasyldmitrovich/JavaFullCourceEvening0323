package com.softserve.edu14.pt14;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        System.out.println(countEmpty(list));
        List<String> listNew = removeEmpty(list);
        System.out.println(list);
        System.out.println(toUppercase(listNew));
    }

    private static long countEmpty(List<String> list) {
        return list.stream()
                .filter(string -> string.isEmpty())
                .count();
    }

    private static List<String> removeEmpty(List<String> list) {
        return list.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
    }

    private static String toUppercase(List<String> list) {
        return list.stream().map(x -> x.toUpperCase(Locale.ROOT)).collect(Collectors.joining(" , "));
    }
}


