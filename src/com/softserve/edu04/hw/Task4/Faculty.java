package com.softserve.edu04.hw.Task4;

public class Faculty {
    public int students;
    public Season season;

    Faculty(int students, Season season){
        this.students = students;
        this.season = season;
    }

    public int getStudents() {
        return students;
    }

    public Season getSeason() {
        return season;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "students=" + students +
                ", season=" + season.getSeasons() +
                '}';
    }
}
