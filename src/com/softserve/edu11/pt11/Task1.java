package com.softserve.edu11.pt11;

public class Task1 {
    public static void main(String[] args) {
        String str1 = "SoftServe";
        String str2 = "SoftServe Academy";
        String str3 = "Test";
        ifSubString(str2,str1);
        ifSubString(str2,str3);
    }

    private static boolean ifSubString(String s1, String s2) {
        //Right decision with value -1, nice to see something like that
        if (s1.indexOf(s2) != -1) {
            System.out.println("Result - contain");
            return false;
        } else {
            System.out.println("Result - doesn't contain");
            return true;
        }
    }
}
