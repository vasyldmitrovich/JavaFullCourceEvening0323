package com.softserve.edu04.hw;

public class Faculty {
    private int numberOfStudents;
    private Seasons season;

    public Faculty(){}

    public Faculty(int numberOfStudents, Seasons season){
        this.numberOfStudents = numberOfStudents;
        this.season = season;
    }

    public void setNumberOfStudents(int numberOfStudents){
        this.numberOfStudents = numberOfStudents;
    }

    public void setSeason(Seasons season){
        this.season = season;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getSeason(){
        return season.toString();
    }
}
