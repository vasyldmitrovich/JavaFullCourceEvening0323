package edu06.inheritance;

import com.softserve.edu06.pt01.inheritance.ClassA;

public class TestClassesAB {
	public static void main(String[] args) {

		System.out.println("The Start of application");

		ClassA a = new ClassA();
		System.out.println("Test ClassA: ");
		a.m1();
		a.m2();
		a.m3();
		a.m4();

		edu06.inheritance.ClassB b = new edu06.inheritance.ClassB();
		System.out.println("Test ClassB:");
		b.m1();
		b.m2();
		b.m3();
		b.m4();

		ClassA b0 = new edu06.inheritance.ClassB();
		System.out.println("Test_0 ClassB:");
		b0.m1();
		b0.m2();
		b0.m3();
		b0.m4();
		((edu06.inheritance.ClassB) b0).m5();
	}
}
