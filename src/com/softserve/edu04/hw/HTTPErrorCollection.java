package com.softserve.edu04.hw;

public enum HTTPErrorCollection {

    E_400(400, "Bad request"),
    E_401(401, "Unauthorized"),
    E_402(402, "Payment required"),
    E_403(403, "Forbidden"),
    E_404(404, "Not found"),
    E_405(405, "Method not allowed");

    private int code;
    private String explanation;
    private HTTPErrorCollection(int code, String explanation){
        this.code = code;
        this.explanation = explanation;
    }

    public String getTheExplanation(){
        return explanation;
    }

    public static String getTheErrorByCode(int code){
        switch(code){
            case 400: return E_400.getTheExplanation();
            case 401: return E_401.getTheExplanation();
            case 402: return E_402.getTheExplanation();
            case 403: return E_403.getTheExplanation();
            case 404: return E_404.getTheExplanation();
            default: return E_405.getTheExplanation();
        }
    }
}
