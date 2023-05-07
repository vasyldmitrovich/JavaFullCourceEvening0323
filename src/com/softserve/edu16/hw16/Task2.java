package com.softserve.edu16.hw16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        String fileName = "JavaCode";
        String fileName2 = "file2.txt";
        ArrayList<String> lines = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                line = line.replaceAll("(public\\s+)(?!class)([a-zA-Z0-9_]+)", "private $2");
                sb.append(line).append("\n");
            }
            br.close();
            FileWriter fw = new FileWriter(fileName2);
            fw.write(sb.toString());
            fw.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
