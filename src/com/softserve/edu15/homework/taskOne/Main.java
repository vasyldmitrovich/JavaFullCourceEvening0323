package com.softserve.edu15.homework.taskOne;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final String PATH_FOR_WRITE = "D:\\Java_Progect\\My_Progect\\Java_SoftServe\\JavaFullCourceEvening0323\\src\\com\\softserve\\catalog\\files\\txt1HWForWrite";

    public static void main(String[] args) {
        System.out.println("Working with my text about my career");
        try {
            String[] strings = readFromFile("D:\\Java_Progect\\My_Progect\\Java_SoftServe\\JavaFullCourceEvening0323\\src\\com\\softserve\\catalog\\files\\txt1Homeworlk");
            System.out.println("Number of lines in txt1HWForWrite");
            writeInFile(PATH_FOR_WRITE,"Number lines in file = "+strings.length);
            System.out.println("The longest line in txt1HWForWrite");
            writeInFile(PATH_FOR_WRITE, "Max length line = "+findLongLine(strings));
            System.out.println("Your name and birthday date");
            writeInFile(PATH_FOR_WRITE, findNameAndDate(strings));
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static String findNameAndDate(String[] strings){
        String result = "";
        Pattern pattern = Pattern.compile("\\d+");
        for(String str : strings){
            String[] stringsWorld = str.split(" ");
            for(int i=0 ; i<stringsWorld.length-1; i++){
                if(stringsWorld[i].equals("name")){
                    result += stringsWorld[i+1]+" ";
                }
            }
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                result += matcher.group()+".";
            }
        }
        return result;
    }

    public static String findLongLine(String[] arrayLines){
        return Arrays.stream(arrayLines).reduce((s, s2) -> s.length() > s2.length() ? s : s2).get();
    }

    public static void writeInFile(String path, String strForWrite) throws FileNotFoundException, IOException{
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path,true))){
            bufferedWriter.write(strForWrite);
            bufferedWriter.write("\n");
        }
    }

    public static String[] readFromFile(String path) throws FileNotFoundException, IOException {
        List<String> stringList = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String str = "";
            while ((str = bufferedReader.readLine()) != null){
                stringList.add(str);
            }
        }
        return stringList.toArray(String[]::new);
    }
}
