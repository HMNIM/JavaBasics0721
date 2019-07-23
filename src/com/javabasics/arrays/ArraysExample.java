package com.javabasics.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExample {

         public static void main(String args[])
         {
             String[] nameArr =  {"Java", "CoreJava", "Spring", "Hibernate"};
             int[] numbers = {3,5, 7, 9, 1, 4, 2};
             // converting array in to arraylist
             List<String> list = Arrays.asList(nameArr);
             // for converting int arrays to list we have to use for loop
             List<Integer> list1 = new ArrayList<Integer>();
             for(int i:numbers)
             {
                list1.add(i);
                 System.out.println(list1);
             }
             System.out.println(list);
             System.out.println(list.size());
             System.out.println(Arrays.toString(nameArr));

         }



}
