package com.softserve.edu13.practical.taskOne;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {//Good
        List<String> list = Arrays.asList("bla","","simp","","second","third","third","sec","blablabla");
        System.out.println("Print how many empty strings are in this list");
        System.out.println(list.stream().filter((s)->s.length() == 0).count());
        System.out.println("Remove all empty Strings from list and print the result");
        System.out.println(list.stream().filter((str)->str.length() > 0).collect(Collectors.toList()));
        System.out.println("Convert String to uppercase and Join them with coma. Print the result");
        System.out.println(list.stream().filter(s -> s.length()>0).map(s -> s.toUpperCase()).reduce((s, s2) -> s+","+s2).get());
    }
}
