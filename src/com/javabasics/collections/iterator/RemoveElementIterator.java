package com.javabasics.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElementIterator {

    public static void main(String args[]) {
        String removeStr = "C";
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list);
       Iterator itr = list.iterator();
       while(itr.hasNext())
       {
           if(removeStr.equals(itr.next()))
           {
               itr.remove();
           }
       }System.out.println(list);
    }


}