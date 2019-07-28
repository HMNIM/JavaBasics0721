package com.javabasics.collections.linkedHashset;

import java.util.LinkedHashSet;

public class LinkedHashSettoArray {
    public static void main(String args[])
    {
        LinkedHashSet<Integer> myhashset = new LinkedHashSet<>();
        myhashset.add(2);
        myhashset.add(4);
        myhashset.add(6);
        myhashset.add(8);
        System.out.println("My actual hash set is : "+myhashset);
        //creating hash set to array
        Integer[] in =  new Integer[myhashset.size()];
        myhashset.toArray(in);
        for (Integer it: in
             ) {
            System.out.println(it);
        }

    }
}
