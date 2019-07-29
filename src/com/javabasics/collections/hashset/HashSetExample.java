package com.javabasics.collections.hashset;

import java.util.HashSet;

//HashSet object like creating object, adding elements,
// verifying whether the hashset is empty or not, removing an element,
// size of the hashset, and to check whether an object exists or not.
public class HashSetExample {
    public static void main(String args[])
    {
        HashSet<String> myhashset = new HashSet<>();
        myhashset. add("Java");
        myhashset.add(".net");
        myhashset.add("kafka");
        System.out.println(myhashset);
        System.out.println("hashset contains elements or not :  " +myhashset.contains("Java"));
        System.out.println("Is hashset empty or not " +myhashset.isEmpty());
        myhashset.remove(".net");
        System.out.println("Removing an element "+myhashset);
        System.out.println("Size of the hashset "+myhashset.size());
    }
}
