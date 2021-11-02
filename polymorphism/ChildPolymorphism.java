package com.technoelevate.javabasics.polymorphism;

public class ChildPolymorphism extends Parent {
	public void calculation(int a, int b) {
		int sub;
		sub=a-b;
		System.out.println("Child class Polymorphism Executed:");
		System.out.println("Addition of two number is:"+sub);
	}

}
