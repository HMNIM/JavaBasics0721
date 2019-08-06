package com.javabasics.collections.hashset;

import java.util.HashSet;

public class HashSetCopy {
    public static void main(String args[])
    {
        HashSet<String> myhashset = new HashSet<>();
        myhashset.add("cream");
        myhashset.add("chocolate");
        myhashset.add("biscuit");
        myhashset.add("carrot");
        System.out.println("Actual hashset is : " +myhashset);
        HashSet<String> nextset = new HashSet<>();
        nextset.add("taste");
        nextset.add("dummy");
        System.out.println("second set : "+nextset);
        myhashset.addAll(nextset);
        System.out.println("copying set in to set " + myhashset);
        myhashset.clear();
        System.out.println("deleting whole set "+myhashset);
    }
}
