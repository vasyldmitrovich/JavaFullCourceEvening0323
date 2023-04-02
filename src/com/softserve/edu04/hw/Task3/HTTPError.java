package com.softserve.edu04.hw.Task3;

public enum HTTPError {
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    PAYMENT_REQUIRED(402, "Payment Required"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found");

    private final int code;
    private final String errorName;

    HTTPError(int code, String errorName){
        this.code = code;
        this.errorName = errorName;
    }

    public int getCode() {
        return code;
    }

    public String getErrorName() {
        return errorName;
    }
}
