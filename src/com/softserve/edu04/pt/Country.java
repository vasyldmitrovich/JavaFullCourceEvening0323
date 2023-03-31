package com.softserve.edu04.pt;

enum Country {
    Ukraine( "Eurasia"),
    USA( "North America"),
    Nigeria( "Africa"),
    Brazil( "South America");

    private final String counrty;
    Country(String country){
        this.counrty = country;
    }
    /*Make reformat code and give correct name of methods*/
    public String getCounrty(){
        return counrty;
    }
}