package com.javabasics.collections.linkedHashset;

import java.util.LinkedHashSet;
// create LinkedHashSet object, adding elements to it,
// getting size of LinkedHashSet object, and is the set empty or not
public class LinkedHashSetExample {
    public static void main(String args[])
    {
        LinkedHashSet<String> mylinkedhash = new LinkedHashSet<>();
        mylinkedhash.add("Java");
        mylinkedhash.add(".net");
        mylinkedhash.add("groovy");
        mylinkedhash.add("selenium");
        System.out.println("My linked hash set is : "+mylinkedhash);
        System.out.println("My linked hash set size is : "+mylinkedhash.size());
        System.out.println("Is my linkedHashset is empty or not is : "+mylinkedhash.contains(".net"));
        // to clear set
        mylinkedhash.clear();
        System.out.println("To deleting the linked hash set  : "+mylinkedhash);
    }
}
