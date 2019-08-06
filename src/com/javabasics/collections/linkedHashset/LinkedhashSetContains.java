package com.javabasics.collections.linkedHashset;

import java.util.LinkedHashSet;

public class LinkedhashSetContains {
    public static void main(String args[])
    {
        LinkedHashSet<String> myhashset = new LinkedHashSet<>();
        myhashset.add("One");
        myhashset.add("Two");
        myhashset.add("Three");
        myhashset.add("Four");
        System.out.println("My actual hashset is : "+myhashset);
        System.out.println("My hash contains the specific element are not :"+myhashset.contains("Three"));
    }
}
