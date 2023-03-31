package com.softserve.edu04.hw;

public class Faculty {
	private int studentsQuantity;
	private Season season;
	
	public Faculty() {
	}
	
	public Faculty(int studentsQuantity, Season season) {
		this.studentsQuantity = studentsQuantity;
		this.season = season;
	}
	
	public int getStudentsQuantity() {
		return studentsQuantity;
	}
	
	public void setStudentsQuantity(int studentsQuantity) {
		this.studentsQuantity = studentsQuantity;
	}
	
	public Season getSeason() {
		return season;
	}
	
	public void setSeason(Season season) {
		this.season = season;
	}
	
	@Override
	public String toString() {
		return "Faculty has " + studentsQuantity + " students, current season is " + season.getName();
	}
}
