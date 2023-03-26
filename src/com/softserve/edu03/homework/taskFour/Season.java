package src.com.softserve.edu03.homework.taskFour;

public enum Season {
    First_Season("Winter_Season"), Two_Season("Spring_Season"), Three_Season("Summer_Season"), Four_Season("Autumn_Season");
    private String nameSeason;

    Season(String nameSeason) {
        this.nameSeason = nameSeason;
    }

    public String getNameSeason() {
        return nameSeason;
    }
}
