package com.softserve.edu04.hw.homework03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HttpErrorApp {

    /*Nice ;-)*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input HTTP error code: ");
        String errorCode = br.readLine();

        switch (errorCode) {
            case "400":
                printHttpErrorMessage(HttpError.ERROR_400);
                break;
            case "401":
                printHttpErrorMessage(HttpError.ERROR_401);
                break;
            case "402":
                printHttpErrorMessage(HttpError.ERROR_402);
                break;
            case "403":
                printHttpErrorMessage(HttpError.ERROR_403);
                break;
            case "404":
                printHttpErrorMessage(HttpError.ERROR_404);
                break;
            case "405":
                printHttpErrorMessage(HttpError.ERROR_405);
                break;
            case "422":
                printHttpErrorMessage(HttpError.ERROR_422);
                break;
            case "500":
                printHttpErrorMessage(HttpError.ERROR_500);
                break;
        }
    }

    public static void printHttpErrorMessage(HttpError errorCode) {
        System.out.println("Message: " + errorCode.getMessage());
    }
}
