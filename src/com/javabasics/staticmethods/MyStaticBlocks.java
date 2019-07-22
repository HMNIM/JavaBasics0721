package com.javabasics.staticmethods;

import java.util.ArrayList;
import java.util.List;

public class MyStaticBlocks {

  private static List<String> list;
  static {
            list = new ArrayList<>();
            list.add("Haritha");
            list.add("Venkat");
            list.add("Mummy");
            list.add("sweet");
         }
         public static void testList()
         {
             System.out.println(list);
         }
         public static void main(String args[])
         {
             MyStaticBlocks.testList();
         }
}
