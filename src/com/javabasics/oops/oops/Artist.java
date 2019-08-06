package com.javabasics.oops.oops;

public class Artist implements Paintable, Showable {
	

	@Override
	public void show() {
		System.out.println("Show is ready");
		
	}

	@Override
	public void paint() {
		System.out.println("Paint the painting");
		
	}

	public static void main(String[] args) {
	
		Artist a = new Artist();
		a.paint();
		a.show();

	}


}
