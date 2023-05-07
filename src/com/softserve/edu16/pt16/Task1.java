package com.softserve.edu16.pt16;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class Task1 {
    public static void main(String[] args) {
        String fileName = "mytext";
        ArrayList<String> lines = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        String[] linesArray = lines.toArray(new String[lines.size()]);
        Map<String, Integer> lengthMap
                = Arrays.stream(linesArray).collect(Collectors.toMap(value->value, value->value.length()));
        System.out.println("The number of symbols in every line:");
        System.out.println(lengthMap);
        System.out.println();
        System.out.println("The longest line: "+Arrays.stream(linesArray).max(Comparator.comparingInt(String::length)).get());
        System.out.println("The shortest line: "+Arrays.stream(linesArray).min(Comparator.comparingInt(String::length)).get());
        System.out.println();
        System.out.println("Show lines that have 'var'");
        for (String line :linesArray){
            if (line.contains("var")){
                System.out.println(line);
            }
        }
    }
}

