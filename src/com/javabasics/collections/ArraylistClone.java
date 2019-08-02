package com.javabasics.collections;

import java.util.ArrayList;

public class ArraylistClone {

	public static void main(String[] args) {
		ArrayList<Integer> mylist1 = new ArrayList<>();
		for(int i=1;i<=10;i++)
		{
			mylist1.add(i);
		}
		System.out.println("My first integer list "+mylist1);
		// copy or clone my list to other list
		@SuppressWarnings("unchecked")
		ArrayList<Integer> mylist2 = (ArrayList<Integer>) mylist1.clone();
		System.out.println("copied my first list in to second list" +mylist2);
	}

}
