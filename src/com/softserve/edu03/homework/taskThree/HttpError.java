package com.softserve.edu03.homework.taskThree;


public enum HttpError {
    Bad_Request(400),Unauthorized(401),Payment_Required(402),Forbidden(403),Not_Found(404),Method_Not_Allowed(405),Not_Acceptable(406);

    int code;

    /*Constructor in enum must be private, not default*/
    private HttpError(int code) {
        this.code = code;
    }

    /*Move this method to another class for example class App*/
}
