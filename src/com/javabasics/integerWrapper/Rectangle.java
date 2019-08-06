package com.javabasics.integerWrapper;

public class Rectangle extends ShapeAbstract{

	double length;
	double width;
	public Rectangle(String color, double length, double width) {
		super(color);
		System.out.println("Rectangular constructor called");
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public String toString() {
		return "Rectangle color is " +super.color + "and area is : " +area();
	}
	

}
