package com.javabasics.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseIterator {
    public static void main(String args[])
    {
        LinkedList<Integer> mylist = new LinkedList<>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(5);
        System.out.println("My actual list" +mylist);
        Iterator itr = mylist.descendingIterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
