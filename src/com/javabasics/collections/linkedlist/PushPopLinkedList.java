package com.javabasics.collections.linkedlist;

import java.util.LinkedList;

public class PushPopLinkedList {
    public static void main(String ars[])
    {
        LinkedList<String> mylist = new LinkedList<>();
        mylist.add("java");
        mylist.add("pega");
        mylist.add("grrovy");
        mylist.add("kafka");
        System.out.println("My actual list " +mylist);
        mylist.push("push other language selenium");
        System.out.println("Pushing element to stack list" +mylist);
        mylist.pop();
        System.out.println(" Removing element from stack " +mylist);

    }
}
