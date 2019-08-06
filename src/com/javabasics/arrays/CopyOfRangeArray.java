package com.javabasics.arrays;

import java.util.Arrays;

public class CopyOfRangeArray {

	public static void main(String[] args) {
	
		int[] myarr = {2,9,5,6,8,6};
		System.out.println("my array: \n");
		for(int i :myarr)
		{
			System.out.println(i);
		}
		int[] myNewArr = Arrays.copyOfRange(myarr, 3, 7);
		System.out.println("my new array: \n");
		for(int j: myNewArr) {
			System.out.println(j);
			
		}
	}

}
