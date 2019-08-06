package com.javabasics.oops.oops;

public class TestAccount {

	public static void main(String[] args) {

		Account ac = new Account();
		ac.setAccNo(1348787000);
		ac.setName("Jimmy");
		ac.setEmail("test@gmail.com");
		ac.setAccNo(500000);
		
		System.out.println(ac.getAccNo() + " " +
		ac.getEmail() + " " +
		ac.getName() + " "+ ac.getAmount());
		

	}

}
