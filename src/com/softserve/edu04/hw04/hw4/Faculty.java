package com.softserve.edu04.hw04.hw4;

public class Faculty {
    int numberOfStudents;
    CurrentSeason currentSeason;

    @Override
    public String toString() {
        return "Faculty{" +
                "numberOfStudents=" + numberOfStudents +
                ", currentSeason=" + currentSeason +
                '}';
    }

    public Faculty(int numberOfStudents, CurrentSeason currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public CurrentSeason getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(CurrentSeason currentSeason) {
        this.currentSeason = currentSeason;
    }
}
