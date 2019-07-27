package com.javabasics.collections.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class RevereseLinkedList {

    public static void main(String args[]) {
        LinkedList<String> mylist = new LinkedList<>();
        mylist.add("Java");
        mylist.add("Pega");
        mylist.add("facebook");
        mylist.add("teach");
        Collections.reverse(mylist);
        for (String str:mylist
             ) {
            System.out.println(str);
        }
    }

}
