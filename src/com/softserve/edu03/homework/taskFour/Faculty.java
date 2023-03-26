package src.com.softserve.edu03.homework.taskFour;

public class Faculty {
    private int countStudent;
    private Season season;

    public int getCountStudent() {
        return countStudent;
    }

    public void setCountStudent(int countStudent) {
        this.countStudent = countStudent;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Faculty(int countStudent, Season season) {
        this.countStudent = countStudent;
        this.season = season;
    }

    @Override
    public String toString() {
        return "Faculty " +
                "countStudent = " + countStudent +
                ", season = " + season.getNameSeason();
    }
}
