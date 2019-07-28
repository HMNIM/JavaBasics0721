package com.javabasics.collections.hashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashtableIterate {
    public static void main(String args[])
    {
        Hashtable<String, String> myhash = new Hashtable<String, String>();
        myhash.put("mom", "mother");
        myhash.put("dad", "father");
        myhash.put("sis", "sister");
        myhash.put("bro", "brother");
        System.out.println("My actual hast set "+myhash);
        Set<String> str = myhash.keySet();
        System.out.println(str);
        for (String str1: str
             ) {
                System.out.println("Value of keys are :" +str1 + " : " +myhash.get(str1));
        }

    }
}
