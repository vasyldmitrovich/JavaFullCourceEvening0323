package com.softserve.edu15.practical.taskOne;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task with Read text");
        try {
            String[] array = readFromFile("D:\\Java_Progect\\My_Progect\\Java_SoftServe\\JavaFullCourceEvening0323\\src\\com\\softserve\\catalog\\files\\txt1Practical");
            System.out.println("Array lines");
            for(String str : array){
                System.out.println(str);
            }
            System.out.println("Count and write the number of symbols in every line.");
            printCountSymbols(array);
            System.out.println("Find the longest and the shortest line");
            findLongAndShortLine(array);
            System.out.println("Find and write only that lines, which consist of word «var»");
            for(String str : findLinesWithContainVar(array)){
                System.out.println(str);
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static String[] findLinesWithContainVar(String[] arrayLines){
        return Arrays.stream(arrayLines).filter(s -> Arrays.stream(s.split(" ")).anyMatch(s1 -> s1.equals("var"))).toArray(String[]::new);
    }

    public static void findLongAndShortLine(String[] arrayLines){
        String maxLengthStr = Arrays.stream(arrayLines).reduce((s, s2) -> s.length() > s2.length() ? s : s2).get();
        String minLengthStr = Arrays.stream(arrayLines).reduce((s, s2) -> s.length() < s2.length() ? s : s2).get();
        System.out.println("Str with max length = "+maxLengthStr);
        System.out.println("Str with min length = "+minLengthStr);
    }

    public static void printCountSymbols(String[] arrayLines){
        for(int i=0; i < arrayLines.length; i++){
            System.out.println("Str with index "+i+" have symbols = "+countSymbolsInLine(arrayLines[i]));
        }
    }

    public static int countSymbolsInLine(String str){
        return str.length();
    }

    public static String[] readFromFile(String path) throws FileNotFoundException, IOException {
        List<String> stringList = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String lineFromFile = "";
            while((lineFromFile = bufferedReader.readLine()) != null){
                stringList.add(lineFromFile);
            }
        }
        return stringList.toArray(String[]::new);
    }
}
