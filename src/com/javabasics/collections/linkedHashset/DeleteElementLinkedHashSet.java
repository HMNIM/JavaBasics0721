package com.javabasics.collections.linkedHashset;

import java.util.LinkedHashSet;

public class DeleteElementLinkedHashSet {
    public static void main(String args[])
    {
        LinkedHashSet<String> myhashset = new LinkedHashSet<>();
        myhashset.add("java");
        myhashset.add("groovy");
        myhashset.add("kafka");
        myhashset.add("spring");
        System.out.println("My actual linked hash set is : "+myhashset);
        // removing specific element in linked hash set
        myhashset.remove("kafka");
        System.out.println("Deleting specific element in linked hash set is : "+myhashset);
    }
}
