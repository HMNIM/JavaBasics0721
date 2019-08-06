package com.javabasics.oops.oops;

public class TestPrint implements Printable1, Showable1{

	
	@Override
	public void paint() {
		System.out.println("painitng");
		
	}

	public static void main(String[] args) {
		TestPrint t = new TestPrint();
		t.paint();

	}

	
}
