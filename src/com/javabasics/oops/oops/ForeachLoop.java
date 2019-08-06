package com.javabasics.oops.oops;

import java.util.ArrayList;
import java.util.List;

public class ForeachLoop {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		list.add("Java");
		list.add("Pega");
		list.add("cloud");
		for (String str : list) {
			System.out.println(str);
		}
			//  simple break in java 	
		for(int i =0; i<10; i++)
		{
			if(i==5)
			System.out.println(i);
			break ;
		}
	

	}

}
