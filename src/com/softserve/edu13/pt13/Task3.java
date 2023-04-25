package com.softserve.edu13.pt13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("I'm");
        list.add("keen");
        list.add("on   ");
        list.add("Java!!!!");
        System.out.println(sortList(list));
    }

    private static List<String> sortList(List<String> list) {
        list.stream().sorted().collect(Collectors.toList());
        return list;
    }
}
