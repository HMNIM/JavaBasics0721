package com.javabasics.collections.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class ShuffleLinkedList {

    public static void main(String args[])
    {
        LinkedList<String> mylist = new LinkedList<>();
        mylist.add("Tree");
        mylist.add("rock");
        mylist.add("soil");
        mylist.add("green");
        Collections.shuffle(mylist);
        for (String str:mylist
             ) {System.out.println(str);
        }
    }
}
