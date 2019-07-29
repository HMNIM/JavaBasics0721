package com.javabasics.collections.linkedlist;

import java.util.LinkedList;

public class AddFirstElementLinkedList {
    public static void main(String args[])
    {
        LinkedList<String> mylist = new LinkedList<>();
        mylist.add("first");
        mylist.add("second");
        mylist.add("third");
        System.out.println("My actual List" +mylist);
        mylist.addFirst("Before First");
        System.out.println("Adding first element to my actual list " +mylist);
        mylist.addLast("After Last");
        System.out.println("Adding last element to my list" +mylist);
    }
}
