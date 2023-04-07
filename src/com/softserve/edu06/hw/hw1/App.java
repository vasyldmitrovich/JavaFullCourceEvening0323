package com.softserve.edu06.hw.hw1;

public class App {
	public static final String FEATHERS = "have feathers";
	public static final String EGGS = "can lay eggs";
	public static void main(String[] args) {
		Eagle eagle = new Eagle(FEATHERS, EGGS);
		Swallow swallow = new Swallow(FEATHERS, EGGS);
		Penguin penguin = new Penguin(FEATHERS, EGGS);
		Kiwi kiwi = new Kiwi(FEATHERS, EGGS);
		Bird[] birds = new Bird[]{eagle,penguin,kiwi,swallow};
		for (Bird bird : birds) {
			System.out.println(bird);
			bird.fly();
		}
	}
}
