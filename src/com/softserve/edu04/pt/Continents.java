package com.softserve.edu04.pt;

public enum Continents {
    UKRAINE("Kyiv","Europe"),
    FRANCE("Paris","Europe"),
    POLAND("Warshawa","Europe"),
    JAPAN("Tokyo","Asia"),
    UZBEKISTAN("Tashkent","Asia"),
    VIETNAM("Hanoi","Asia"),
    AUSTRALIA("Sidney","Australia"),
    NEW_ZELAND("Aukland","Australia"),
    PAPUA_NEW_GUINEA("Port Moresby","Australia"),
    EGYPT("Cairo","Africa"),
    BURKINA_FASO("Ouagadougou","Africa"),
    KENYA("Nairobi","Africa"),
    MEXICO("Mexico City","North America"),
    USA("Washington","North America"),
    CANADA("Ottawa","North America"),
    ;

    private String capCity, continent;

    private Continents(String capCity, String continent){
        this.capCity = capCity;
        this.continent = continent;
    }

    public static String getTheCatalogue(){
        return "\\n\\t(Ukraine, France, Poland\" +\n" +
                "\"\\n\\tJapan, Uzbekistan, Vietnam\" +\n" +
                "\"\\n\\tAustralia, New_Zeland, Papua_New_Guinea\" +\n" +
                "\"\\n\\tEgypt, Burkina_Faso, Kenya\" +\n" +
                "\"\\n\\tMexico, USA, Canada)";
    }

    @Override
    public String toString(){
        return "capital city: " + capCity + "; continent: " + continent;
    }
}
