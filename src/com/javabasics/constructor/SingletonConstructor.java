package com.javabasics.constructor;

public class SingletonConstructor {

	private static SingletonConstructor insta = null;
	public int x = 5;
	
	private SingletonConstructor()
	{
		System.out.println("private constructor -for not instantiating objects from other classes");
	}
	// created static method to get Instance
	public static SingletonConstructor getInstance()
	{
		if(insta == null)
		{
			//create a new instance
			insta = new SingletonConstructor();
			System.out.println(insta);
		}
		return insta;
		
	}
	
	
	public static void main(String[] args) {
		SingletonConstructor s =  SingletonConstructor.getInstance();
		s.x = 10;
		System.out.println(s.x);

	}

}
