package com.softserve.edu13.hw;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        String myCode = "fbi";
        int n = 3;
        //Ok
        System.out.println("Original code: " + myCode);
        String encryptedCode = encrypt(myCode, n);
        System.out.println("Encrypted code: " + encryptedCode);
        String decryptedCode = decrypt(encryptedCode, n);
        System.out.println("Decrypted code: " + decryptedCode);
    }

    public static String encrypt(String s, int n) {
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char cHar = s.charAt(i);
            char encryptChar = (char) (cHar + n);
            code.append(encryptChar);
        }
        return code.toString();
    }

    public static String decrypt(String s, int n) {
        StringBuilder decode = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char cHar = s.charAt(i);
            char decryptChar = (char) (cHar - n);
            decode.append(decryptChar);
        }
        return decode.toString();
    }
}
