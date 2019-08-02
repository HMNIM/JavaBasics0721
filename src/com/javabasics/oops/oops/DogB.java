package com.javabasics.oops.oops;

public class DogB extends AnimalA {
	
	public void bark()
	{
		System.out.println("Dog barks");
	}
	public static void main(String[] args) {

		DogB d = new DogB();
		d.bark();
		d.eat();

	}

}
