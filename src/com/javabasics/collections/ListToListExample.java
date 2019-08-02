package com.javabasics.collections;

import java.util.ArrayList;

public class ListToListExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> mylist1 = new ArrayList<>();
		for(int i=1; i<=5;i++)
		{
			mylist1.add(i);
		}
		System.out.println("first arraylist " +mylist1);
		ArrayList<Integer> mylist2 = new ArrayList<>();
		for(int j=6;j<=10;j++) {
			mylist2.add(j);
		}
		System.out.println("Second arraylist is "+mylist2);
		// adding list to list
		mylist1.addAll(mylist2);
		System.out.println("after adding two lists in one list "+mylist1);
		// to delete elements in arraylist
		mylist1.clear();
		System.out.println("Cleared List" +mylist1);
	
	}

}
