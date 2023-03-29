package edu04.pt04.pt3;

public enum Continents {
    ASIA("Asia", "China", "Japan", "Thailand", "Bali"),
    EUROPE("Europe", "Ukraine", "Italy", "France", "Germany"),
    AMERICA("America", "USA", "CANADA", "Chili", "Peru");

    private final String name;
    private final String country1;
    private final String country2;
    private final String country3;
    private final String country4;

    Continents(String name, String country1, String country2, String country3, String country4) {
        this.name = name;
        this.country1 = country1;
        this.country2 = country2;
        this.country3 = country3;
        this.country4 = country4;
    }

    public String getCountry1() {
        return country1;
    }

    public String getCountry2() {
        return country2;
    }

    public String getCountry3() {
        return country3;
    }

    public String getCountry4() {
        return country4;
    }
}
