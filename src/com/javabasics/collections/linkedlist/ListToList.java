package com.javabasics.collections.linkedlist;

import java.util.LinkedList;

public class ListToList {
    public static void main(String args[]){
        LinkedList<String> mylist1 = new LinkedList<>();
        mylist1.add("First");
        mylist1.add("Second");
        mylist1.add("Third");
        System.out.println("My first list is : " +mylist1);
        LinkedList<String> mylist2 = new LinkedList<>();
        mylist2.add("One");
        mylist2.add("Two");
        mylist2.add("Three");
        System.out.println("My second list is : "+mylist2);
        mylist1.addAll(mylist2);
        System.out.println("First list added in to second list : "+mylist1);
        mylist1.clear();
        System.out.println("Clearing List : " +mylist1);
    }
}
