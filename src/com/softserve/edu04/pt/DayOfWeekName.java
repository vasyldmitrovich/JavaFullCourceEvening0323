package com.softserve.edu04.pt;

public enum DayOfWeekName {
	MONDAY("monday (понеділок)"), TUESDAY("tuesday (вівторок)"), WEDNESDAY("wednesday (середа)"), THURSDAY("thursday (четвер)"), FRIDAY("friday (п'ятниця)"), SATURDAY("saturday (субота)"), SUNDAY("sunday (неділя)");
	private final String uaEn;
	
	DayOfWeekName(String uaEn) {
		this.uaEn = uaEn;
	}
	
	public String getUaEn() {
		return uaEn;
	}
	
	public String getNameOfWeekDay(int num) {
		DayOfWeekName dayOfWeekName = DayOfWeekName.MONDAY;
		switch (num) {
			case 1:
				break;
			case 2:
				dayOfWeekName = DayOfWeekName.TUESDAY;
				break;
			case 3:
				dayOfWeekName = DayOfWeekName.WEDNESDAY;
				break;
			case 4:
				dayOfWeekName = DayOfWeekName.THURSDAY;
				break;
			case 5:
				dayOfWeekName = DayOfWeekName.FRIDAY;
				break;
			case 6:
				dayOfWeekName = DayOfWeekName.SATURDAY;
				break;
			case 7:
				dayOfWeekName = DayOfWeekName.SUNDAY;
				break;
			default:
				System.out.println("Wrong number");
				break;
		}
		return dayOfWeekName.getUaEn();
	}
}
