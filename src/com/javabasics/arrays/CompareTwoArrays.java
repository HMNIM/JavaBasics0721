package com.javabasics.arrays;

import java.util.Arrays;

public class CompareTwoArrays {

	public static void main(String[] args) {
		
		String[] firstArr = {"JAVA", "PEGA", "SPRING", "BOOT"};
		String[] secondArr = {"JAVA", "PEGA", "SPRING", "BOOT"};
		// compare two arrays 
		System.out.println("Comparing two arrays are  " + Arrays.deepEquals(firstArr, secondArr));
		
		String[] ThirdArr = {"JAVA", "JOHN", "SPRING", "BOOT"};
		System.out.println("Comparing two arrays are  " + Arrays.deepEquals(firstArr, ThirdArr));
		
	}

}
