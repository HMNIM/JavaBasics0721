package com.javabasics.collections.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSort {
    public static void main(String args[]) {
        LinkedList<User> mylist = new LinkedList<>();
        mylist.add(new User(2, "haritha", 5000));
        mylist.add(new User(4, "someone", 9000));
        mylist.add(new User(1,"mummy", 10000));
        mylist.add(new User(3, "teacher", 1000));
        Collections.sort(mylist, new MyComparatorSort());
        for (User str:mylist) {
            System.out.println(str);

        }

    }
}
