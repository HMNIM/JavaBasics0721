package com.javabasics.collections;

import java.util.ArrayList;

public class ArraylistExample {

	public static void main(String[] args) {
/*		Here we can see example for basic ArrayList operations like creating object for ArrayList,
		adding objects into ArrayList, accessing objects based on index, 
		searching an object in ArrayList whether it is listed under this instance or not, 
		adding elements at specific index, 
		checking whether the ArrayList is empty or not, 
		getting object index, and finally size of the ArrayList.
		
		
*/		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add(".Net");
		list.add("test");
		list.add("ooty");
		System.out.println("Actual list " +list);
		System.out.println("Accesing object based on Index " +list.get(2));
		System.out.println("Searching an object in list whther it is listed or not "+list.contains("null"));
		list.add(3, "Pubg");
		System.out.println("Adding element at specific index" +list);
		System.out.println("Checking whther attaulist id empty or not " + list.isEmpty());
		System.out.println("Getting object(ooty) of index is "+list.indexOf("ooty"));
		System.out.println("Size of the arraylist "+list.size());
	}

}
