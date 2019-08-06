package com.javabasics.oops.oops;

public class BabyDog extends DogBB{

	public void crawl() {
		System.out.println("Baby dog can crawl");
	}
	public static void main(String[] args) {
		BabyDog b = new BabyDog();
		b.crawl();
		b.bark();
		b.eat();

	}

}
