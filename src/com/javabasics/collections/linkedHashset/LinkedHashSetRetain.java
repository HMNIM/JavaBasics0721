package com.javabasics.collections.linkedHashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetRetain {
    public static void main(String args[])
    {
        LinkedHashSet<String> myhashset = new LinkedHashSet<>();
        myhashset.add("first");
        myhashset.add("second");
        myhashset.add("third");
        System.out.println("My actual hashset is : "+myhashset);
        HashSet<String> myhashset1 = new HashSet<>();
        myhashset1.add("fourth");
        myhashset1.add("second");
        myhashset1.add("first");
        myhashset1.add("fifth");
        System.out.println("My second hashset is : "+myhashset1);
        myhashset.retainAll(myhashset1);
        System.out.println("Retaining or same elements are from two hash sets are : "+myhashset);
    }
}
