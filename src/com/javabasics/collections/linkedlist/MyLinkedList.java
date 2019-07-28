package com.javabasics.collections.linkedlist;

import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String args[])
    {
        LinkedList<String> mylist = new LinkedList<>();
        mylist.add("zombie");
        mylist.add("lionking");
        mylist.add("titanic");
        mylist.add("kaa");
        System.out.println("whole list : " +mylist);
        System.out.println("list size : "+mylist.size());
        System.out.println("Does list empty or not : "+mylist.isEmpty());
        System.out.println("Does it contain or not : " +mylist.contains("titanic"));



    }
}
