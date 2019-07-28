package com.javabasics.collections.hashset;

import java.util.HashSet;

//compare two sets, and retain the values which are common on both set objects.
// By calling retainAll() method you can do this operation.
public class HashSetRetain {
    public static void main(String args[]){
        HashSet<String> myhash = new HashSet<>();
        myhash.add("one");
        myhash.add("two");
        myhash.add("three");
        myhash.add("four");
        System.out.println("My actual set "+myhash);
        HashSet<String> myhash1 = new HashSet<>();
        myhash1.add("five");
        myhash1.add("two");
        myhash1.add("one");
        System.out.println("My second set is "+myhash1);
        myhash.retainAll(myhash1);
        System.out.println("Retaining  set " +myhash);
    }
}
