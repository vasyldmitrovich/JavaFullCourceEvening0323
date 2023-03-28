package com.softserve.edu01.pt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseOrderApp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please, input first string: ");
        String str1 = br.readLine();

        System.out.println("Please, input second string: ");
        String str2 = br.readLine();

        System.out.println("Please, input third string: ");
        String str3 = br.readLine();

        System.out.println("Output text:");
        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str1);
    }
}
