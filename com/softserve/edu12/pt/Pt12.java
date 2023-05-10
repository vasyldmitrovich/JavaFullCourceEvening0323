package com.softserve.edu12.pt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pt12 {
        static int squareRectangle() throws MyException, IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            if(a>=0 && b>=0){
                return a*b;
//            if (n > 0) {
//                int a = 100 / n;
            } else { // Create and call exception
                throw new MyException("input value is below zero!");
            }
        }
        public static void main(String[ ] args) {
            //Task 1
            System.out.println("Please input two integers:");
            try {
                System.out.println("Square is: " + squareRectangle()); // try / catch block is required
            } catch (MyException | IOException e1) {
                System.err.print(e1);
            }
        }


}
