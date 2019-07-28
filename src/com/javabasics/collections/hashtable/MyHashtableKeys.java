package com.javabasics.collections.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MyHashtableKeys {
    public static void main(String args[])
    {
        HashMap<String, String> myhashmap = new HashMap<>();
        myhashmap.put("toungue", "taste");
        myhashmap.put("skin", "touch");
        myhashmap.put("nose", "smell");
        myhashmap.put("ears", "hear");
        System.out.println(myhashmap);
        Set<String> str = myhashmap.keySet();
        System.out.println(str);
        for (String keys: str
             ) {
            System.out.println(" keys are " + " : " +keys +  " : " +" And Values are  " + " : " + myhashmap.get(keys));
        }
    }
}
