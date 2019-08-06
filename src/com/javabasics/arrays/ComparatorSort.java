package com.javabasics.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorSort {

	public static void main(String[] args) {
		String[] mystrArr = {"Testing", "Java", "Spring"};
		 Arrays.sort(mystrArr,new Comparator<String>(){
			 
		@Override
        public int compare(String a, String b) {
            return a.compareTo(b);
        }});
     
		 for(String str:mystrArr){
        System.out.println(str);
		 }
	}	
		
	
}
