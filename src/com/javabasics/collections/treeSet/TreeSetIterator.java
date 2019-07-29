package com.javabasics.collections.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetIterator {
    public static void main(String args[]){
        TreeSet<String> myTreeSet = new TreeSet<>();
        myTreeSet.add("one");
        myTreeSet.add("two");
        myTreeSet.add("three");
        myTreeSet.add("four");
        myTreeSet.add("five");
        myTreeSet.add("one");
        System.out.println("My tree set size : "+myTreeSet.size());
        Iterator itr = myTreeSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
