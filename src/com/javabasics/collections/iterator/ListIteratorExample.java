package com.javabasics.collections.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static  void main(String args[])
    {
        List<Integer> mylist = new ArrayList<>();
        ListIterator<Integer> myTwist = null;
        mylist.add(19);
        mylist.add(12);
        mylist.add(31);
        mylist.add(14);
        mylist.add(5);
        mylist.add(16);
        myTwist = mylist.listIterator();
        while(myTwist.hasNext())
        {
            System.out.println(myTwist.next());
        }
        while (myTwist.hasPrevious())
        {
            System.out.println(myTwist.previous());
        }

    }
}
