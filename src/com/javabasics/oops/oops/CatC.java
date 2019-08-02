package com.javabasics.oops.oops;

public class CatC extends AnimalA {

	private void sound(){
		System.out.println(" Cat makes Meow sound");
	}
	public static void main(String[] args) {
		
		CatC c = new CatC();
		c.sound();
		//c.bark(); // Hierarchical  inheritance can not call dog here
		c.eat();

	}

}
