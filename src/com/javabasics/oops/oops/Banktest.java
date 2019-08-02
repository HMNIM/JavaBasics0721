package com.javabasics.oops.oops;

public class Banktest {

	public static void main(String[] args) {

		Bank b = new SBI();
		System.out.println("Rate of interest for SBI is " +b.interestRate());
		Bank a =  new AndhraBank();
		System.out.println("Rate of interest for Andhrabank is " +a.interestRate());

	}

}
