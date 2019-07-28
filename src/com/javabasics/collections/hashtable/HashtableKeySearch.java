package com.javabasics.collections.hashtable;

import java.util.HashMap;

public class HashtableKeySearch {
    public static void main(String args[])
    {
        HashMap<Integer, String> myhashmap = new HashMap<>();
        myhashmap.put(1, "One");
        myhashmap.put(2, "Two");
        myhashmap.put(3, "Three");
        myhashmap.put(4, "Four");
        System.out.println("My hashmmap is "+myhashmap);
        if(myhashmap.containsKey(2))
        {
            System.out.println("My hashmap contains key value or not " + " : " + myhashmap.containsKey(2));
        }
        else{
            System.out.println(false);
        }
        if(myhashmap.containsValue("Three"))
        {
            System.out.println("My hashmap contains value or not" +  " : "+ myhashmap.containsValue("Three"));
        }
        else{
            System.out.println(false);
        }

    }
}
