package com.javabasics.collections.hashtable;

import java.util.Hashtable;

//creating hashtable object, adding key-value pair,
// getting the value based on key, checking hashtable is empty or not, removing an element, and size of the hashtable.
public class HashTableExample {
    public static void main(String args[]){
        Hashtable<String, String> myhash = new Hashtable<>();
        myhash.put("hari", "haritha");
        myhash.put("venki", "venkat");
        myhash.put("makkena", "nimmaturi");
        System.out.println("My actual hash table : "+myhash);
        System.out.println("Getting the value based on key : "+myhash.get("venki"));
        System.out.println("check whther value contains or not : "+myhash.contains("haritha"));
        System.out.println("Check whether key contains or not  : "+myhash.containsKey("makkena"));
        System.out.println("Checking hashtable is empty or not  : "+myhash.isEmpty());
        System.out.println("getting the size of hashtable : "+myhash.size());
        myhash.remove("hari");
        System.out.println("removing a key : "+myhash);

    }
}
