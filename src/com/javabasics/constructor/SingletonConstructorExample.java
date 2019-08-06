package com.javabasics.constructor;

public class SingletonConstructorExample {
	
	private static SingletonConstructorExample instanceObject;
	
	private SingletonConstructorExample()
	{
		
	}
	// create static to get instance
	public static SingletonConstructorExample getinstance()
	{
		if(instanceObject == null)
		{
		instanceObject = new SingletonConstructorExample();
		}
		return instanceObject;
	}
	

}
