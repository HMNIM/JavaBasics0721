package com.javabasics.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {

		ArrayList <Integer> mylist = new ArrayList<>();
		for(int i =0; i<=10; i++) {
			mylist.add(i);
		}
		System.out.println(mylist);
		// or using iterator
		Iterator itr = mylist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ArrayList<String> mylist1 = new ArrayList<>();
		mylist1.add("Java");
		mylist1.add("pega");
		mylist1.add("html");
		Iterator itr1 = mylist1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
	

}
