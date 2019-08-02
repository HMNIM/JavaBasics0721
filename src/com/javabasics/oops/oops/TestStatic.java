package com.javabasics.oops.oops;

public class TestStatic {

	public static void main(String[] args) {

		StaticDrawable s = new RectangleStatic();
		s.draw();
		System.out.println(StaticDrawable.cube(3));

	}

}
