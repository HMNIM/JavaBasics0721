package com.javabasics.oops.oops;

public class Printing implements Printable {

	@Override
	public void print() {
		System.out.println("Hello printing");
		
	}
	public static void main(String[] args) {
		Printing p = new Printing();
		p.print();
		System.out.println("Name is " +p.name);
		System.out.println("Minimum numnber is "+p.minNum);

	}

}
