package com.javabasics.collections.treeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

//how to create TreeSet with other collection. By passing another collection to the TreeSet constructor,
// you can copy entire collections elements to the TreeSet.
public class ListToTreeSet {
    public static void main(String args[])
    {
        List<String> mylist = new ArrayList<>();
        mylist.add("Java");
        mylist.add("Spring");
        mylist.add("Boot");
        mylist.add("Kafka");
        System.out.println("My actual list is : "+mylist);
        //convert list to tree set
        TreeSet<String> mytreeset = new TreeSet<>(mylist);
        System.out.println("Converting list in to tree set : " +mytreeset);


    }
}
