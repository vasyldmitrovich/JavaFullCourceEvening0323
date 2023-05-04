package com.softserve.edu15.homework.taskTwo;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try {
            String[] arrays = readFromFile("D:\\Java_Progect\\My_Progect\\Java_SoftServe\\JavaFullCourceEvening0323\\src\\com\\softserve\\catalog\\files\\txt2HomeWorlkReader");
            arrays = replaceOldWorldOnNewWorld(arrays);
            writeInFile(arrays, "D:\\Java_Progect\\My_Progect\\Java_SoftServe\\JavaFullCourceEvening0323\\src\\com\\softserve\\catalog\\files\\txt2HomeWorkForWrite");
        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }

    }

    public static void writeInFile(String[] strings, String path) throws FileNotFoundException, IOException{
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            for(String str : strings){
                bufferedWriter.write(str);
                bufferedWriter.write("\n");
            }
        }
    }

    public static String[] replaceOldWorldOnNewWorld(String[] strings){
        for(int j=0; j < strings.length; j++){
            String[] worlds = strings[j].split(" ");
            for(int i=0; i < worlds.length; i++){
                if(worlds[i].equals("public")){
                    worlds[i] = "private";
                }
            }
            strings[j] = Arrays.stream(worlds).collect(Collectors.joining(" "));
        }
        return strings;
    }

    public static String[] readFromFile(String path) throws FileNotFoundException, IOException {
        List<String> list = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String str = "";
            while ((str = bufferedReader.readLine()) != null){
                list.add(str);
            }
        }
        return list.toArray(String[]::new);
    }

}
