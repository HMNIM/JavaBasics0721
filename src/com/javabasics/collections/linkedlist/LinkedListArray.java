package com.javabasics.collections.linkedlist;

import java.util.LinkedList;

public class LinkedListArray {
    public static void main(String args[])
    {
        LinkedList<String> mylist = new LinkedList<>();
        mylist.add("teeth");
        mylist.add("toungue");
        mylist.add("nails");
        mylist.add("head");
        System.out.println("My actual list :"+mylist);
        //converting list in to array
        String[] arr = new String[mylist.size()];
        mylist.toArray(arr);
        System.out.println("Array List is : " +mylist + "  And " + "Size of my array is : " +mylist.size());
    }
}
