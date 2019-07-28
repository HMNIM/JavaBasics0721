package com.javabasics.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorLinkedList {
    public static void main(String args[]){
        LinkedList<String> mylist = new LinkedList<>();
        mylist.add("thirsty");
        mylist.add("hungry");
        mylist.add("sleepy");
        mylist.add("beauty");
        Iterator itr = mylist.iterator();
        while(itr.hasNext()) System.out.println(itr.next());
    }
}
