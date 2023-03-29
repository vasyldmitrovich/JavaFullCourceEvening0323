package com.softserve.edu03.homework.taskThree;

import java.util.Arrays;
import java.util.Optional;

public class App {
    public void foundHttpError(int codeErrorFromUser){
        Optional<HttpError> httpErrorResult = Arrays.stream(HttpError.values()).filter(httpError -> httpError.code == codeErrorFromUser).findFirst();
        if(httpErrorResult.isPresent() == false){
            System.out.println("HttpError not found!");
        }else {
            System.out.println(httpErrorResult.get().name());
        }
    }
}
