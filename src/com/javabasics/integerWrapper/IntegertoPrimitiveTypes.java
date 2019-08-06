package com.javabasics.integerWrapper;

public class IntegertoPrimitiveTypes {

	public static void main(String[] args) {
	
		Integer num = new Integer(10);
		System.out.println(num.doubleValue());
		System.out.println(num.floatValue());
		System.out.println(num.intValue());
		System.out.println(num.byteValue());
		System.out.println(num.shortValue());
		System.out.println(num.longValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		// String to integer
		String str= "20";
		Integer i = Integer.valueOf(str);
		System.out.println(i);
		
		String number = "768";
		Integer j = Integer.parseInt(number);
		System.out.println("converted integer: "+j);
		number = "-786";
		j = Integer.parseInt(number);
		System.out.println("converted integer: "+j);
		
	}

}
