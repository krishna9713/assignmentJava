package com.technoelevate.javabasics.polymorphism;

public class MainMethodPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent sc= new Parent();
		sc.calculation(66,88);
		ChildPolymorphism pk = new ChildPolymorphism();
		pk.calculation(600, 90);

	}

}
