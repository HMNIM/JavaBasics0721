package com.javabasics.oops.oops;

public class Programmer extends Employee{
	
	int bonus = 10000;

	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("Bonus  " +p.bonus);
		System.out.println("Employee salary is "+p.salary);

	}

}
