package com.softserve.edu04.hw.homework03;

public enum HttpError {
    ERROR_400("Bad Request"),
    ERROR_401("Unauthorized"),
    ERROR_402("Payment Required"),
    ERROR_403("Forbidden"),
    ERROR_404("Not Found"),
    ERROR_405("Method Not Allowed"),
    ERROR_422("Unprocessable Entity"),
    ERROR_500("Internal Server Error");
    private final String message;

    HttpError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
