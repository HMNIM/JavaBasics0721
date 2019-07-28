package com.javabasics.collections.linkedHashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class IteratorLinkedHashSet {
    public static void main(String args[])
    {
        LinkedHashSet<String> myhashset = new LinkedHashSet<>();
        myhashset.add("teacher");
        myhashset.add("proffesor");
        myhashset.add("doctor");
        myhashset.add("engineer");
        Iterator itr = myhashset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
