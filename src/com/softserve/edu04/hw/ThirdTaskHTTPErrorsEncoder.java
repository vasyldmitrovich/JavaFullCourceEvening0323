package com.softserve.edu04.hw;

import java.util.Scanner;

public class ThirdTaskHTTPErrorsEncoder {
    public static void main(String[] args) {
        System.out.println("Error's meaning: " + HTTPErrorCollection.getTheErrorByCode(getTheCode()));
    }

    static int getTheCode(){
        System.out.print("Input the code of the error [400, 405]: ");
        return new Scanner(System.in).nextInt();
    }
}
