package com.javabasics.integerWrapper;

public abstract class ShapeAbstract {

	String color;
	// abstract methods
	abstract double area();
	// abstract class can have constructor
	public ShapeAbstract(String color) {
		this.color = color;
		System.out.println("Shape constructor called");
	}
	@Override
	public String toString() {
		return "ShapeAbstract [color=" + color + "]";
	}
	
	

}
