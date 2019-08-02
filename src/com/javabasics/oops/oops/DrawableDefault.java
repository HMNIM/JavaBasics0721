package com.javabasics.oops.oops;

public interface DrawableDefault {
	
	void draw();
	default void message()
	{
		System.out.println(" default method");
	}

}
