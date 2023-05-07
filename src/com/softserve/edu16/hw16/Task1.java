package com.softserve.edu16.hw16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        String fileName = "MyCareer";
        String fileName2 = "file2.txt";
        ArrayList<String> lines = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            int numLines = 0;
            int maxLength = 0;
            String longestLine = "";
            while ((line = br.readLine()) != null) {
                lines.add(line);
                numLines++;
                if (line.length() > maxLength) {
                    maxLength = line.length();
                    longestLine = line;
                }
            }
            FileWriter fw = new FileWriter(fileName2);
            fw.write("Number of lines in file 'MyCareer': " + numLines + "\n");
            fw.write("Longest line: " + longestLine + "\n");
            fw.write("My name and birthday date: Tanya Serbinenko, date of my birth 31.01.1996");
            fw.close();
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
