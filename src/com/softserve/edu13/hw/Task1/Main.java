package com.softserve.edu13.hw.Task1;

public class Main {
    public static void main(String[] args) {
        String str = "mama";
        int n = 12;
        str = encrypt(str, n);
        System.out.println(str);
        str = decrypt(str, n);
        System.out.println(str);
    }

    private static String encrypt(String s, int n){
        StringBuilder sb = new StringBuilder();
        char shifted;
        for (char letter : s.toCharArray()){
            if (Character.isLetter(letter)){
                shifted = (char) (((letter - 'a' + n) % 26) + 'a');
                sb .append(shifted);
            } else {
                sb.append(letter);
            }
        }
        return sb.toString();
    }

    private static String decrypt(String s, int n){
        StringBuilder sb = new StringBuilder();
        for (char letter : s.toCharArray()) {
            if (Character.isLetter(letter)) {
                char shifted = (char) (((letter - 'a' + 26 - n) % 26) + 'a');
                sb.append(shifted);
            } else {
                sb.append(letter);
            }
        }
        return sb.toString();
    }
}
