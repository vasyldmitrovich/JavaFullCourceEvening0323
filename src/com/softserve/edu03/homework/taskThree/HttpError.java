package src.com.softserve.edu03.homework.taskThree;

import src.com.softserve.edu03.practic.taskThree.Continent;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum HttpError {
    Bad_Request(400),Unauthorized(401),Payment_Required(402),Forbidden(403),Not_Found(404),Method_Not_Allowed(405),Not_Acceptable(406);

    private int code;

    HttpError(int code) {
        this.code = code;
    }

    public static void foundHttpError(int codeErrorFromUser){
        Optional<HttpError> httpErrorResult = Arrays.stream(HttpError.values()).filter(httpError -> httpError.code == codeErrorFromUser).findFirst();
        if(httpErrorResult.isPresent() == false){
            System.out.println("HttpError not found!");
        }else {
            System.out.println(httpErrorResult.get().name());
        }
    }
}
