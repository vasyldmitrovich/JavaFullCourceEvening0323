package com.softserve.edu04.hw;

public enum Season {
	SPRING("Spring"), SUMMER("Summer"), WINTER("Winter"), AUTUMN("Autumn");
	
	private final String name;
	
	Season(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Season getSeason(String name) {
		Season season = Season.WINTER;
		name = name.toLowerCase();
		switch (name) {
			case "winter":
				break;
			case "spring":
				season = Season.SPRING;
				break;
			case "summer":
				season = Season.SUMMER;
				break;
			case "autumn":
				season = Season.AUTUMN;
				break;
			default:
				System.out.println("wrong season name");
		}
		return season;
	}
}
