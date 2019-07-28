package com.javabasics.collections.linkedHashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashsetTOSet {
    public static void main(String args[])
    {
        LinkedHashSet<String> myhashset = new LinkedHashSet<>();
        myhashset.add("cool");
        myhashset.add("sunny");
        myhashset.add("rainy");
        System.out.println("My actual linked hashset is : "+myhashset);
        HashSet<String> myhashset1 = new LinkedHashSet<>();
        myhashset1.add("spring");
        myhashset1.add("autumn");
        System.out.println("My second set of linked hashset is : "+myhashset1);
        myhashset.addAll(myhashset1);
        System.out.println("Combining two linked hashsets are : "+myhashset);
     }
}
