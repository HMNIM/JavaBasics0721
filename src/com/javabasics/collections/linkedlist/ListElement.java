package com.javabasics.collections.linkedlist;

import java.util.LinkedList;

public class ListElement {
    public static void main(String args[])
    {
        LinkedList<String> mylist1 = new LinkedList<>();
        mylist1.add("over");
        mylist1.add("begin");
        mylist1.add("check");
        System.out.println(mylist1);
        LinkedList<String> mylist2 = new LinkedList<>();
        mylist2.add("over");
        mylist2.add("begin");
        System.out.println("Does mylist1 elements are in mylist2 : "+mylist1.containsAll(mylist2));
        mylist2.add("test");
        System.out.println(mylist1.containsAll(mylist2));

    }
}
