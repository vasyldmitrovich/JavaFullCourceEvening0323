package com.softserve.edu04.pt;

/**
 * List of continents and countries source
 * https://simple.wikipedia.org/wiki/List_of_countries_by_continents
 * */
public enum Continents {
	ASIA("Asia"), AFRICA("Africa"), NORTH_AMERICA("North America"), SOUTH_AMERICA("South America"), ANTARCTICA("There are no countries in Antarctica"), EUROPE("Europe"), AUSTRALIA("Australia");
	private final String continent;
	
	Continents(String continent) {
		this.continent = continent;
	}
	
	public String getContinent() {
		return continent;
	}
	
	public String getContinentByCountry(String country) {
		Continents continents = Continents.ANTARCTICA;
		switch (country.toLowerCase()) {
			case "antarctica":
				break;
			case "australia":
			case "flores":
			case "lombok":
			case "melanesia":
			case "new caledonia":
			case "new guinea":
			case "sulawesi":
			case "sumbawa":
			case "timor":
				continents = Continents.AUSTRALIA;
				break;
			case "brazil":
			case "argentina":
			case "bolivia":
			case "chile":
			case "colombia":
			case "ecuador":
			case "falkland islands":
			case "french guiana":
			case "guyana":
			case "paraguay":
			case "peru":
			case "south georgia":
			case "south sandwich islands":
			case "suriname":
			case "trinidad":
			case "tobago":
			case "uruguay":
			case "venezuela":
				continents = Continents.SOUTH_AMERICA;
				break;
			case "canada":
			case "mexico":
			case "usa":
			case "navassa island":
			case "puerto rico":
			case "virgin islands":
			case "dominican republic":
			case "cuba":
			case "greenland":
			case "haiti":
			case "belize":
			case "costa rica":
			case "el salvador":
			case "guatemala":
			case "honduras":
			case "guadeloupe":
			case "martinique":
			case "nicaragua":
			case "panama":
			case "jamaica":
			case "bahamas":
			case "barbados":
			case "DominicaU":
				continents = Continents.NORTH_AMERICA;
				break;
			case "albania":
			case "andorra":
			case "austria":
			case "belarus":
			case "belgium":
			case "bosnia and herzegovina":
			case "bulgaria":
			case "croatia":
			case "cyprus":
			case "czech republic":
			case "denmark":
			case "estonia":
			case "france":
			case "finland":
			case "germany":
			case "greece":
			case "hungary":
			case "iceland":
			case "ireland":
			case "italy":
			case "kosovo":
			case "latvia":
			case "liechtenstein":
			case "lithuania":
			case "luxembourg":
			case "north macedonia":
			case "malta":
			case "moldova":
			case "monaco":
			case "montenegro":
			case "netherlands":
			case "norway":
			case "poland":
			case "portugal":
			case "romania":
			case "russia":
			case "san marino":
			case "serbia":
			case "slovakia":
			case "slovenia":
			case "spain":
			case "sweden":
			case "switzerland":
			case "ukraine":
			case "united kingdom":
			case "vatican":
				continents = Continents.EUROPE;
				break;
			case "afghanistan":
			case "armenia":
			case "azerbaijan":
			case "bahrain":
			case "bangladesh":
			case "bhutan":
			case "brunei":
			case "cambodia":
			case "china":
			case "east timor":
			case "georgia":
			case "india":
			case "indonesia":
			case "iran":
			case "iraq":
			case "israel":
			case "japan":
			case "jordan":
			case "kazakhstan":
			case "kuwait":
			case "kyrgyzstan":
			case "laos":
			case "lebanon":
			case "malaysia":
			case "maldives":
			case "mongolia":
			case "myanmar":
			case "nepal":
			case "north korea":
			case "oman":
			case "pakistan":
			case "palestine":
			case "philippines":
			case "qatar":
			case "saudi arabia":
			case "singapore":
			case "south korea":
			case "sri lanka":
			case "syria":
			case "taiwan":
			case "tajikistan":
			case "thailand":
			case "turkey":
			case "turkmenistan":
			case "united arab emirates":
			case "uzbekistan":
			case "vietnam":
			case "yemen":
				continents = Continents.ASIA;
				break;
			case "algeria":
			case "angola":
			case "benin":
			case "botswana":
			case "burkina faso":
			case "burundi":
			case "cameroon":
			case "cape verde":
			case "central african republic":
			case "chad":
			case "comoros":
			case "republic of the congo":
			case "democratic republic of the congo":
			case "ivory coast":
			case "djibouti":
			case "equatorial guinea":
			case "egypt":
			case "eritrea":
			case "ethiopia":
			case "gabon":
			case "gambia":
			case "ghana":
			case "guinea":
			case "guinea-bissau":
			case "kenya":
			case "lesotho":
			case "liberia":
			case "libya":
			case "madagascar":
			case "malawi":
			case "mali":
			case "mauritania":
			case "mauritius":
			case "morocco":
			case "mozambique":
			case "namibia":
			case "niger":
			case "nigeria":
			case "réunion":
			case "rwanda":
			case "são tomé and príncipe":
			case "senegal":
			case "seychelles":
			case "sierra leone":
			case "somalia":
			case "south africa":
			case "south sudan":
			case "sudan":
			case "swaziland":
			case "tanzania":
			case "togo":
			case "tunisia":
			case "uganda":
			case "western sahara":
			case "zambia":
			case "zimbabwe":
				continents = Continents.AFRICA;
				break;
			default:
				System.out.println("Wrong country name");
		}
		return continents.getContinent();
	}
}
