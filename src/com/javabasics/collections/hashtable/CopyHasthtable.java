package com.javabasics.collections.hashtable;

import java.util.HashMap;
import java.util.Hashtable;

public class CopyHasthtable {
    public static void main(String args[])
    {
        Hashtable<String, String> hashmap = new Hashtable<>();
        hashmap.put("cat", "meow");
        hashmap.put("dog", "bark");
        hashmap.put("cow", "moann");
        hashmap.put("tiger", "roar");
        System.out.println("My hashmap " +hashmap);
        HashMap<String, String> submap = new HashMap<>();
        submap.put("teacher", "teach");
        submap.put("waiter", "wait");
        submap.putAll(hashmap);
        System.out.println("My whole map is "+submap);
    }
}
