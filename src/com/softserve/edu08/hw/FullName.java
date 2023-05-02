package com.softserve.edu08.hw;

public class FullName {
    private String FirstName;
    private String LastName;

    public FullName(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;

    }

    public String getFirstName() {
        return "<"+FirstName+">";
    }

    public String getLastName() {
        return "<"+LastName+">";
    }


}
