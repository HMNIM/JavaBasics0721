package com.javabasics.collections.linkedlist;

import java.util.LinkedList;

public class CloneLinkedList {
    public static void main(String args[]) {
        LinkedList<String> mylist = new LinkedList<>();
        mylist.add("aragula");
        mylist.add("spinach");
        mylist.add("cilantro");
        mylist.add("basil");
        System.out.println("my full list " + mylist);
        LinkedList<String> list = (LinkedList<String>) mylist.clone();
        System.out.println("After copying mylist to list " +list);


    }
}
