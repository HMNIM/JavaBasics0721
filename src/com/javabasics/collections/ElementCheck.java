package com.javabasics.collections;

import java.util.ArrayList;

public class ElementCheck {

	public static void main(String[] args) {
		ArrayList<String> str1 = new ArrayList<>();
		str1.add("Saanvi");
		str1.add("Daashvik");
		str1.add("Hari");
		System.out.println("Actual list "+str1 );
		ArrayList<String> str2 = new ArrayList<>();
		str2.add("Hari");
		System.out.println(str2);
		System.out.println("checking elements in first list "+str1.containsAll(str2));
		
		str2.add("tired");
		System.out.println("check elements in second list "+str1.containsAll(str2));
		System.out.println(str2);

	}

}
