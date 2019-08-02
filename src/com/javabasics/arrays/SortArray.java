package com.javabasics.arrays;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int[] myArr = {9,6,8,5,15,94,32};
		Arrays.sort(myArr);
		for(int i:myArr)
		{
			System.out.println(i);
		}
		String[] myStrArr = {"D", "O", "T", "S", "J" , "N", "A", "L"};
		Arrays.sort(myStrArr);
		for(String i:myStrArr)
		{
			System.out.println(i);
		}
	}

}
