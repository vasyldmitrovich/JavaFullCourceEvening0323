package com.softserve.edu07.pt.task2;

public class App {
	public static void main(String[] args) {
		System.out.println("We have 6 persons:");
		//Make method and this method must return array of Person, after that set it to array persons
		Teacher teacher1 = new Teacher();
		Teacher teacher2 = new Teacher();
		Cleaner cleaner1 = new Cleaner();
		Cleaner cleaner2 = new Cleaner();
		Student student1 = new Student();
		Student student2 = new Student();
		Person[] persons = new Person[]{teacher1, cleaner1, student1, teacher2, cleaner2, student2};
		for (Person person : persons) {
			person.print();
			if (person instanceof Staff) {
				System.out.println("My salary is " + ((Staff)person).salary());
			}
		}
	}
}
