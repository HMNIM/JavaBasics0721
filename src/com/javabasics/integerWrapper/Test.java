package com.javabasics.integerWrapper;

public class Test {

	public static void main(String[] args) {

		ShapeAbstract s1 = new Circle("Green", 2.3);
		ShapeAbstract s2 = new Rectangle("pink", 2, 4);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}

}
