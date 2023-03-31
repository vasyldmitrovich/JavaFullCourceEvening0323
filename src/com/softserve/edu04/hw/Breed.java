package com.softserve.edu04.hw;

public enum Breed {
	POODLE("Poodle"), GERMAN_SHEPHERD("German shepherd"), LABRADOR("Labrador");
	
	private final String name;
	
	Breed(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
//	 interesting, why I couldn't leave this method without static,
//	 but in DayOfWeekName -> getNameOfWeekDay() is working fine without static.
//	 Both methods look the same for me, can't find the reason
	public static String getBreedName(Dog dog) {
		String breedName = dog.getName();
		switch (breedName) {
			case "POODLE":
				breedName = Breed.POODLE.getName();
				break;
			case "GERMAN_SHEPHERD":
				breedName = Breed.GERMAN_SHEPHERD.getName();
				break;
			case "Labrador":
				breedName = Breed.LABRADOR.getName();
				break;
			default:
				System.out.println("This dog has no breed"); //is it a correct message here?
		}
	return breedName;
	}
}
