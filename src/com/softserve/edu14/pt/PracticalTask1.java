package com.softserve.edu14.pt;

import com.softserve.edu09.pt.HeavyBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PracticalTask1 {
    public static void main(String[] args) {
        //Good
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        System.out.println(list);

        long empty = list.stream().filter(String::isEmpty).count();
        System.out.println("There are " + empty + " empty strings in this list.");

        List<String> newList = list.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println(newList);

        String upperCaseString = list.stream().filter(s -> !s.isEmpty()).map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(upperCaseString);
    }
}
