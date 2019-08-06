package com.javabasics.oops.oops;

public class C extends A // B//suppose if it were  
  {
	
	public static void main(String args[])
	{
		C c = new C();
		c.meesage(); //Now which msg() method either from A or from B would be invoked?   Multiple inheritance doesnt support 
	}

}
