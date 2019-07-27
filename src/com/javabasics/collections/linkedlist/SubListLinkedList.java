package com.javabasics.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class SubListLinkedList {

    public static void main(String args[])
    {
        LinkedList<String> mylist1 = new LinkedList<>();
        mylist1.add("test");
        mylist1.add("prove");
        mylist1.add("exam");
        mylist1.add("interview");
        System.out.println(" my list is "+mylist1);
        List<String> mylist2 = mylist1.subList(2, 4);
        System.out.println("SubList of mylist is "+mylist2);
    }
}
