package com.softserve.edu15.practical.taskTwo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        try {
            String[] arrayStr = readFromFile("D:\\Java_Progect\\My_Progect\\Java_SoftServe\\JavaFullCourceEvening0323\\src\\com\\softserve\\catalog\\files\\txt2Pracrical");
            System.out.println("Find and output to the console all words starting with a vowel");
            foundWorldWhichStartOnVowel(arrayStr);
            System.out.println("Find and output to the console all words for which the last letter of one word matches the first letter of the next word");
            foundWorldWhichLastLetterInFirst(arrayStr);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void foundWorldWhichLastLetterInFirst(String[] arraysWorld){
        for(int i=0; i < arraysWorld.length-1; i++){
            if(arraysWorld[i].charAt(arraysWorld[i].length()-1) == arraysWorld[i+1].charAt(0)){
                System.out.println("First world = "+arraysWorld[i] + " first world = "+arraysWorld[i+1]);
            }
        }
    }

    public static void foundWorldWhichStartOnVowel(String[] arraysWorld){
        Pattern pattern = Pattern.compile("\\b[aeiou]\\w*\\b", Pattern.CASE_INSENSITIVE);
        String collect = Arrays.stream(arraysWorld).collect(Collectors.joining(" "));
        Matcher matcher = pattern.matcher(collect);
        while (matcher.find()) {
            System.out.print(matcher.group()+" ");
        }
    }

    public static String[] readFromFile(String path) throws FileNotFoundException, IOException {
        List<String> stringList = new ArrayList<>();
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(path)))) {
            while (scanner.hasNext()){
                stringList.add(scanner.next());
            }
        }
        return stringList.toArray(String[]::new);
    }
}
