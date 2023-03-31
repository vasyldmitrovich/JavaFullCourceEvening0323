package com.softserve.edu04.hw;

enum Http_error {
    Error_404("Not Found"),
    Error_410("Gone"),
    Error_502("Bad Gateway"),
    Error_301("Moved Permanently");
    private String meaning;

    Http_error(String error_mean) {
        this.meaning = error_mean;
    }

    public String getUrl() {
        return meaning;
    }
}
