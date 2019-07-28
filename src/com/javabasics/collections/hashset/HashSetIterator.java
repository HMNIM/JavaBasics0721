package com.javabasics.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {
    public static void main(String args[])
    {
        HashSet<String> myhashset = new HashSet<>();
        myhashset.add("sweety");
        myhashset.add("salty");
        myhashset.add("creamy");
        myhashset.add("milky");
        myhashset.add("salty"); // wont allow duplicate values
        Iterator<String> itr = myhashset.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
