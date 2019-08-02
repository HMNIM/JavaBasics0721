package com.javabasics.arrays;

import java.util.Arrays;

public class CopyOfArray {

	public static void main(String[] args) {
		
		int[] myarr =  {1,3,5,9,6,7,4};
		System.out.println("my first array size is " +myarr.length);
		// need more size to my first array
		int[] myNewArr = Arrays.copyOf(myarr, 12);
		System.out.println("new aarray with size after copying " +myNewArr.length);
		

	}



}
